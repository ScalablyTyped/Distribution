package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertySet extends StObject {
  
  def forEach(callback: js.Function2[/* key */ String, /* properties */ js.Array[js.Object], Unit]): Unit = js.native
  
  def getAggregation(properties: String): js.Array[Any] = js.native
  def getAggregation(properties: js.Array[js.Object]): js.Array[Any] = js.native
  
  def getDbIds(): js.Array[Double] = js.native
  
  def getKeysWithCategories(): js.Array[String] = js.native
  
  def getValidIds(displayName: String, displayCategory: String): js.Array[String] = js.native
  
  def getValue2PropertiesMap(properties: String): js.Array[Any] = js.native
  def getValue2PropertiesMap(properties: js.Array[js.Object]): js.Array[Any] = js.native
  
  def getVisibleKeys(): js.Array[String] = js.native
  
  def merge(propertySet: PropertySet): this.type = js.native
}
