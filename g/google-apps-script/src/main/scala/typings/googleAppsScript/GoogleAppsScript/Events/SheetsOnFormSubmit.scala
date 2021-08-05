package typings.googleAppsScript.GoogleAppsScript.Events

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import typings.googleAppsScript.GoogleAppsScript.Spreadsheet.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetsOnFormSubmit
  extends StObject
     with AppsScriptEvent {
  
  var namedValues: StringDictionary[js.Array[String]]
  
  var range: Range
  
  var values: js.Array[String]
}
object SheetsOnFormSubmit {
  
  inline def apply(
    authMode: AuthMode,
    namedValues: StringDictionary[js.Array[String]],
    range: Range,
    triggerUid: String,
    user: User,
    values: js.Array[String]
  ): SheetsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], namedValues = namedValues.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetsOnFormSubmit]
  }
  
  extension [Self <: SheetsOnFormSubmit](x: Self) {
    
    inline def setNamedValues(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "namedValues", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
