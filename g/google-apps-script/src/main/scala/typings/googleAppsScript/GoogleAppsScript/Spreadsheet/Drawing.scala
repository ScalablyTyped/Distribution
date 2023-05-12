package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a drawing over a sheet in a spreadsheet.
  */
trait Drawing extends StObject {
  
  def getContainerInfo(): ContainerInfo
  
  def getHeight(): Integer
  
  def getOnAction(): String
  
  def getSheet(): Sheet
  
  def getWidth(): Integer
  
  def getZIndex(): Double
  
  def remove(): Unit
  
  def setHeight(height: Integer): Drawing
  
  def setOnAction(macroName: String): Drawing
  
  def setPosition(anchorRowPos: Integer, anchorColPos: Integer, offsetX: Integer, offsetY: Integer): Drawing
  
  def setWidth(width: Integer): Drawing
  
  def setZIndex(zIndex: Double): Drawing
}
object Drawing {
  
  inline def apply(
    getContainerInfo: () => ContainerInfo,
    getHeight: () => Integer,
    getOnAction: () => String,
    getSheet: () => Sheet,
    getWidth: () => Integer,
    getZIndex: () => Double,
    remove: () => Unit,
    setHeight: Integer => Drawing,
    setOnAction: String => Drawing,
    setPosition: (Integer, Integer, Integer, Integer) => Drawing,
    setWidth: Integer => Drawing,
    setZIndex: Double => Drawing
  ): Drawing = {
    val __obj = js.Dynamic.literal(getContainerInfo = js.Any.fromFunction0(getContainerInfo), getHeight = js.Any.fromFunction0(getHeight), getOnAction = js.Any.fromFunction0(getOnAction), getSheet = js.Any.fromFunction0(getSheet), getWidth = js.Any.fromFunction0(getWidth), getZIndex = js.Any.fromFunction0(getZIndex), remove = js.Any.fromFunction0(remove), setHeight = js.Any.fromFunction1(setHeight), setOnAction = js.Any.fromFunction1(setOnAction), setPosition = js.Any.fromFunction4(setPosition), setWidth = js.Any.fromFunction1(setWidth), setZIndex = js.Any.fromFunction1(setZIndex))
    __obj.asInstanceOf[Drawing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Drawing] (val x: Self) extends AnyVal {
    
    inline def setGetContainerInfo(value: () => ContainerInfo): Self = StObject.set(x, "getContainerInfo", js.Any.fromFunction0(value))
    
    inline def setGetHeight(value: () => Integer): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
    
    inline def setGetOnAction(value: () => String): Self = StObject.set(x, "getOnAction", js.Any.fromFunction0(value))
    
    inline def setGetSheet(value: () => Sheet): Self = StObject.set(x, "getSheet", js.Any.fromFunction0(value))
    
    inline def setGetWidth(value: () => Integer): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    
    inline def setGetZIndex(value: () => Double): Self = StObject.set(x, "getZIndex", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSetHeight(value: Integer => Drawing): Self = StObject.set(x, "setHeight", js.Any.fromFunction1(value))
    
    inline def setSetOnAction(value: String => Drawing): Self = StObject.set(x, "setOnAction", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: (Integer, Integer, Integer, Integer) => Drawing): Self = StObject.set(x, "setPosition", js.Any.fromFunction4(value))
    
    inline def setSetWidth(value: Integer => Drawing): Self = StObject.set(x, "setWidth", js.Any.fromFunction1(value))
    
    inline def setSetZIndex(value: Double => Drawing): Self = StObject.set(x, "setZIndex", js.Any.fromFunction1(value))
  }
}
