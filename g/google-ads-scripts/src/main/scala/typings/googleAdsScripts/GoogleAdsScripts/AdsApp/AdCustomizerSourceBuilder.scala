package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import typings.googleAdsScripts.GoogleAdsScripts.Base.Builder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for AdCustomizerSource objects. For example, to create an ad customizer source with name "Inventory", and attributes "item" (of type text),
  * "numLeft" (of type number), and "lowCost" (of type price):
  *
  *      var adCustomizerSourceBuilder = AdsApp.newAdCustomizerSourceBuilder();
  *      var adCustomizerSourceOperation = adCustomizerSourceBuilder
  *        .withName("Inventory")                                 // required
  *        .addAttribute("item", "text")                          // at least one attribute is required
  *        .addAttributes({numLeft: "number", lowCost: "price"})
  *        .build();                                              // create the ad customizer source
  */
trait AdCustomizerSourceBuilder
  extends StObject
     with Builder[AdCustomizerSourceOperation] {
  
  /**
    * Adds an attribute of the given name and type to the new ad customizer source. Existing attributes are not modified.
    *
    * Valid types are text, number, price, date.
    *
    * An error will be thrown if the additional attribute's name is one of start date, end date, device preference, scheduling, target campaign,
    * target ad group, keyword text, match type, keyword, id, case insensitive.
    *
    * An attribute named custom id (case insensitive) will be interpreted as a special attribute, which has the additional requirement of each item
    * in the data source having unique value for that attribute.
    */
  def addAttribute(name: String, `type`: String): this.type
  
  /**
    * Adds a set of attributes to the new ad customizer source. Existing attributes are not modified. The set of new attributes are specified by an object
    * where the keys are the names and the values are the respective types of the attributes. For instance,
    *
    *      var attributes = {item: "text", numLeft: "number", lowCost: "price"};
    *      var builder = AdsApp.newAdCustomizerSourceBuilder();
    *      var adCustomizerSource = builder
    *        .withName("Inventory")
    *        .addAttributes(attributes)
    *        .build();
    *
    * adds the attributes `item` (of type `text`), `numLeft` (of type `number`), and `lowCost` (of type `price`) to the new ad customizer data source named `"Inventory"`.
    * Valid attribute types are text, number, price, date.
    *
    * An error will be thrown if an additional attribute's name is one of start date, end date, device preference, scheduling, target campaign, target ad group,
    * keyword text, match type, keyword, id, case insensitive.
    */
  def addAttributes(attributes: Record[String, String | Double | Null]): this.type
  
  /** Sets the name of the new ad customizer source to the specified value. This field is required. */
  def withName(name: String): this.type
}
object AdCustomizerSourceBuilder {
  
  inline def apply(
    addAttribute: (String, String) => AdCustomizerSourceBuilder,
    addAttributes: Record[String, String | Double | Null] => AdCustomizerSourceBuilder,
    build: () => AdCustomizerSourceOperation,
    withName: String => AdCustomizerSourceBuilder
  ): AdCustomizerSourceBuilder = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addAttributes = js.Any.fromFunction1(addAttributes), build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[AdCustomizerSourceBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdCustomizerSourceBuilder] (val x: Self) extends AnyVal {
    
    inline def setAddAttribute(value: (String, String) => AdCustomizerSourceBuilder): Self = StObject.set(x, "addAttribute", js.Any.fromFunction2(value))
    
    inline def setAddAttributes(value: Record[String, String | Double | Null] => AdCustomizerSourceBuilder): Self = StObject.set(x, "addAttributes", js.Any.fromFunction1(value))
    
    inline def setWithName(value: String => AdCustomizerSourceBuilder): Self = StObject.set(x, "withName", js.Any.fromFunction1(value))
  }
}
