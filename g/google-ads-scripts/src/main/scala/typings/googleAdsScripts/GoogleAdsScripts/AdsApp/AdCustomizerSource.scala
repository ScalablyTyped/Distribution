package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an ad customizer data source as seen in the Business Data section of the Shared Library.
  * Each ad customizer source has a unique name and a set of attributes.
  * The attributes are defined by an attribute name, which must be unique across attributes within the data source, and a type,
  * which must be one of the following: text, number, price, date.
  * An ad customizer source can have many AdCustomizerItems in it, or it can have none. Refer to the feature guide for more information.
  */
trait AdCustomizerSource extends StObject {
  
  /** Returns a builder for a new item in this data source. */
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder
  
  /**
    * Returns a map from attribute name to attribute type.
    * Contains all of the attributes in this ad customizer data source.
    * For instance, a data source that contains the item attributes `item` (of type `text`), `numLeft` (of type `number`), and `lowCost` (of type `price`)
    * would return `{item: 'text', numLeft: 'number', lowCost: 'price'}`.
    */
  def getAttributes(): Record[String, String | Double | Null]
  
  /** Returns the type of this entity as a String, in this case, "AdCustomizerSource". */
  def getEntityType(): String
  
  /** Returns the name of the ad customizer source. */
  def getName(): String
  
  /** Returns the selector of all items in this ad customizer data source. */
  def items(): AdCustomizerItemSelector
}
object AdCustomizerSource {
  
  inline def apply(
    adCustomizerItemBuilder: () => AdCustomizerItemBuilder,
    getAttributes: () => Record[String, String | Double | Null],
    getEntityType: () => String,
    getName: () => String,
    items: () => AdCustomizerItemSelector
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal(adCustomizerItemBuilder = js.Any.fromFunction0(adCustomizerItemBuilder), getAttributes = js.Any.fromFunction0(getAttributes), getEntityType = js.Any.fromFunction0(getEntityType), getName = js.Any.fromFunction0(getName), items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[AdCustomizerSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdCustomizerSource] (val x: Self) extends AnyVal {
    
    inline def setAdCustomizerItemBuilder(value: () => AdCustomizerItemBuilder): Self = StObject.set(x, "adCustomizerItemBuilder", js.Any.fromFunction0(value))
    
    inline def setGetAttributes(value: () => Record[String, String | Double | Null]): Self = StObject.set(x, "getAttributes", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setItems(value: () => AdCustomizerItemSelector): Self = StObject.set(x, "items", js.Any.fromFunction0(value))
  }
}
