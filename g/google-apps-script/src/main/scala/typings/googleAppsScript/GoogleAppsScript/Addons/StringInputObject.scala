package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Signle and multi-value text widgets object
  */
trait StringInputObject extends StObject {
  
  var value: js.Array[String]
}
object StringInputObject {
  
  inline def apply(value: js.Array[String]): StringInputObject = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringInputObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringInputObject] (val x: Self) extends AnyVal {
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
