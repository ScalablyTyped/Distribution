package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Version extends StObject {
  
  def stores(schema: StringDictionary[String | Null]): Version
  
  def upgrade(fn: js.Function1[/* trans */ Transaction, PromiseLike[Any] | Unit]): Version
}
object Version {
  
  inline def apply(
    stores: StringDictionary[String | Null] => Version,
    upgrade: js.Function1[/* trans */ Transaction, PromiseLike[Any] | Unit] => Version
  ): Version = {
    val __obj = js.Dynamic.literal(stores = js.Any.fromFunction1(stores), upgrade = js.Any.fromFunction1(upgrade))
    __obj.asInstanceOf[Version]
  }
  
  extension [Self <: Version](x: Self) {
    
    inline def setStores(value: StringDictionary[String | Null] => Version): Self = StObject.set(x, "stores", js.Any.fromFunction1(value))
    
    inline def setUpgrade(value: js.Function1[/* trans */ Transaction, PromiseLike[Any] | Unit] => Version): Self = StObject.set(x, "upgrade", js.Any.fromFunction1(value))
  }
}
