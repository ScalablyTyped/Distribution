package typings.atEmberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dashPrivateTypesMod {
  import org.scalablytyped.runtime.Instantiable1
  import org.scalablytyped.runtime.StringDictionary
  import typings.atEmberObject.mixinMod.default
  import typings.std.Partial

  type ComputedPropertyCallback[T] = ComputedPropertyGetterFunction[T] | ComputedPropertyObj[T]
  type ComputedPropertyGetter[T] = ComputedPropertyGetterFunction[T] | ComputedPropertyGetterObj[T]
  type ComputedPropertyGetterFunction[T] = js.ThisFunction1[/* this */ js.Any, /* key */ String, T]
  /* Rewritten from type alias, can be one of: 
    - typings.atEmberObject.dashPrivateTypesMod.ComputedPropertyGetterObj[T]
    - typings.atEmberObject.dashPrivateTypesMod.ComputedPropertySetterObj[T]
    - typings.atEmberObject.dashPrivateTypesMod.ComputedPropertyGetterObj[T] with typings.atEmberObject.dashPrivateTypesMod.ComputedPropertySetterObj[T]
  */
  type ComputedPropertyObj[T] = _ComputedPropertyObj[T] | (ComputedPropertyGetterObj[T] with ComputedPropertySetterObj[T])
  type ComputedPropertySetter[T] = ComputedPropertySetterFunction[T] | ComputedPropertySetterObj[T]
  type ComputedPropertySetterFunction[T] = js.ThisFunction3[/* this */ js.Any, /* key */ String, /* newVal */ T, /* oldVal */ T, T]
  type EmberClassArguments = StringDictionary[js.Any]
  type EmberClassConstructor[T] = (Instantiable1[js.UndefOr[/* properties */ js.Object], T]) with (Instantiable1[/* args (repeated) */ js.Any, T])
  type EmberInstanceArguments[T] = Partial[T] with StringDictionary[js.Any]
  type ExtractPropertyNamesOfType[T, S] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends S? K : never}[keyof T] */ js.Any
  type Fix[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.atEmberObject.atEmberObjectStrings.Fix with T
  type MixinOrLiteral[T, Base] = (default[T, Base]) | T
  type Objectify[T] = T
  type ObserverMethod[Target, Sender] = String | (js.ThisFunction4[
    /* this */ Target, 
    /* sender */ Sender, 
    /* key */ String, 
    /* value */ js.Any, 
    /* rev */ Double, 
    Unit
  ])
  type UnwrapComputedPropertyGetter[T] = T
  type UnwrapComputedPropertyGetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertyGetter<T[P]>}
    */ typings.atEmberObject.atEmberObjectStrings.UnwrapComputedPropertyGetters with T
  type UnwrapComputedPropertySetter[T] = T
  type UnwrapComputedPropertySetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertySetter<T[P]>}
    */ typings.atEmberObject.atEmberObjectStrings.UnwrapComputedPropertySetters with T
}
