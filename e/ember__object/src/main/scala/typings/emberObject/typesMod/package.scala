package typings.emberObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComputedPropertyCallback[T] = typings.emberObject.typesMod.ComputedPropertyGetterFunction[T] | typings.emberObject.typesMod.ComputedPropertyObj[T]
  type ComputedPropertyGetter[T] = typings.emberObject.typesMod.ComputedPropertyGetterFunction[T] | typings.emberObject.typesMod.ComputedPropertyGetterObj[T]
  type ComputedPropertyGetterFunction[T] = js.ThisFunction1[/* this */ js.Any, /* key */ java.lang.String, T]
  /* Rewritten from type alias, can be one of: 
    - typings.emberObject.typesMod.ComputedPropertyGetterObj[T]
    - typings.emberObject.typesMod.ComputedPropertySetterObj[T]
    - typings.emberObject.typesMod.ComputedPropertyGetterObj[T] with typings.emberObject.typesMod.ComputedPropertySetterObj[T]
  */
  type ComputedPropertyObj[T] = typings.emberObject.typesMod._ComputedPropertyObj[T] | (typings.emberObject.typesMod.ComputedPropertyGetterObj[T] with typings.emberObject.typesMod.ComputedPropertySetterObj[T])
  type ComputedPropertySetter[T] = typings.emberObject.typesMod.ComputedPropertySetterFunction[T] | typings.emberObject.typesMod.ComputedPropertySetterObj[T]
  type ComputedPropertySetterFunction[T] = js.ThisFunction3[/* this */ js.Any, /* key */ java.lang.String, /* newVal */ T, /* oldVal */ T, T]
  type EmberClassArguments = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EmberClassConstructor[T] = (org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* properties */ js.Object], T]) with (org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, T])
  type EmberInstanceArguments[T] = typings.std.Partial[T] with org.scalablytyped.runtime.StringDictionary[js.Any]
  type ExtractPropertyNamesOfType[T, S] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends S? K : never}[keyof T] */ js.Any
  type Fix[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.emberObject.emberObjectStrings.Fix with org.scalablytyped.runtime.TopLevel[T]
  type MixinOrLiteral[T, Base] = (typings.emberObject.mixinMod.default[T, Base]) | T
  type Objectify[T] = T
  type ObserverMethod[Target, Sender] = (/* keyof Target */ java.lang.String) | (js.ThisFunction4[
    /* this */ Target, 
    /* sender */ Sender, 
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* rev */ scala.Double, 
    scala.Unit
  ])
  type UnwrapComputedPropertyGetter[T] = T
  type UnwrapComputedPropertyGetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertyGetter<T[P]>}
    */ typings.emberObject.emberObjectStrings.UnwrapComputedPropertyGetters with org.scalablytyped.runtime.TopLevel[T]
  type UnwrapComputedPropertySetter[T] = T
  type UnwrapComputedPropertySetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertySetter<T[P]>}
    */ typings.emberObject.emberObjectStrings.UnwrapComputedPropertySetters with org.scalablytyped.runtime.TopLevel[T]
}
