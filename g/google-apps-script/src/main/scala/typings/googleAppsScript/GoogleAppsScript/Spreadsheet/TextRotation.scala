package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access the text rotation settings for a cell.
  */
trait TextRotation extends StObject {
  
  def getDegrees(): Integer
  
  def isVertical(): Boolean
}
object TextRotation {
  
  inline def apply(getDegrees: () => Integer, isVertical: () => Boolean): TextRotation = {
    val __obj = js.Dynamic.literal(getDegrees = js.Any.fromFunction0(getDegrees), isVertical = js.Any.fromFunction0(isVertical))
    __obj.asInstanceOf[TextRotation]
  }
  
  extension [Self <: TextRotation](x: Self) {
    
    inline def setGetDegrees(value: () => Integer): Self = StObject.set(x, "getDegrees", js.Any.fromFunction0(value))
    
    inline def setIsVertical(value: () => Boolean): Self = StObject.set(x, "isVertical", js.Any.fromFunction0(value))
  }
}
