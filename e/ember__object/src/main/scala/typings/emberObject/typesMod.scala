package typings.emberObject

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.emberObject.mixinMod.default
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@ember/object/-private/types", "ComputedPropertyMarker")
  @js.native
  class ComputedPropertyMarker[Get, Set] () extends StObject {
    
    // Necessary in order to avoid losing type information
    //    see: https://github.com/typed-ember/ember-cli-typescript/issues/246#issuecomment-414812013
    var ______getType: Get = js.native
    
    var ______setType: Set = js.native
  }
  
  type ComputedPropertyCallback[T] = ComputedPropertyGetterFunction[T] | ComputedPropertyObj[T]
  
  type ComputedPropertyGetter[T] = ComputedPropertyGetterFunction[T] | ComputedPropertyGetterObj[T]
  
  type ComputedPropertyGetterFunction[T] = js.ThisFunction1[/* this */ js.Any, /* key */ String, T]
  
  @js.native
  trait ComputedPropertyGetterObj[T] extends _ComputedPropertyObj[T] {
    
    def get(key: String): T = js.native
  }
  object ComputedPropertyGetterObj {
    
    @scala.inline
    def apply[T](get: String => T): ComputedPropertyGetterObj[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[ComputedPropertyGetterObj[T]]
    }
    
    @scala.inline
    implicit class ComputedPropertyGetterObjMutableBuilder[Self <: ComputedPropertyGetterObj[_], T] (val x: Self with ComputedPropertyGetterObj[T]) extends AnyVal {
      
      @scala.inline
      def setGet(value: String => T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emberObject.typesMod.ComputedPropertyGetterObj[T]
    - typings.emberObject.typesMod.ComputedPropertySetterObj[T]
    - typings.emberObject.typesMod.ComputedPropertyGetterObj[T] with typings.emberObject.typesMod.ComputedPropertySetterObj[T]
  */
  type ComputedPropertyObj[T] = _ComputedPropertyObj[T] | (ComputedPropertyGetterObj[T] with ComputedPropertySetterObj[T])
  
  type ComputedPropertySetter[T] = ComputedPropertySetterFunction[T] | ComputedPropertySetterObj[T]
  
  type ComputedPropertySetterFunction[T] = js.ThisFunction3[/* this */ js.Any, /* key */ String, /* newVal */ T, /* oldVal */ T, T]
  
  @js.native
  trait ComputedPropertySetterObj[T] extends _ComputedPropertyObj[T] {
    
    def set(key: String, value: T): T = js.native
  }
  object ComputedPropertySetterObj {
    
    @scala.inline
    def apply[T](set: (String, T) => T): ComputedPropertySetterObj[T] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[ComputedPropertySetterObj[T]]
    }
    
    @scala.inline
    implicit class ComputedPropertySetterObjMutableBuilder[Self <: ComputedPropertySetterObj[_], T] (val x: Self with ComputedPropertySetterObj[T]) extends AnyVal {
      
      @scala.inline
      def setSet(value: (String, T) => T): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type EmberClassArguments = StringDictionary[js.Any]
  
  type EmberClassConstructor[T] = (Instantiable1[/* properties */ js.UndefOr[js.Object], T]) with (Instantiable1[/* args (repeated) */ js.Any, T])
  
  type EmberInstanceArguments[T] = Partial[T] with StringDictionary[js.Any]
  
  type ExtractPropertyNamesOfType[T, S] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends S? K : never}[keyof T] */ js.Any
  
  type Fix[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K]}
    */ typings.emberObject.emberObjectStrings.Fix with TopLevel[T]
  
  type MixinOrLiteral[T, Base] = (default[T, Base]) | T
  
  type Objectify[T] = T
  
  type ObserverMethod[Target, Sender] = (/* keyof Target */ String) | (js.ThisFunction4[
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
    */ typings.emberObject.emberObjectStrings.UnwrapComputedPropertyGetters with TopLevel[T]
  
  type UnwrapComputedPropertySetter[T] = T
  
  type UnwrapComputedPropertySetters[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @ember/object.@ember/object/-private/types.UnwrapComputedPropertySetter<T[P]>}
    */ typings.emberObject.emberObjectStrings.UnwrapComputedPropertySetters with TopLevel[T]
  
  trait _ComputedPropertyObj[T] extends StObject
  object _ComputedPropertyObj {
    
    @scala.inline
    def ComputedPropertyGetterObj[T](get: String => T): typings.emberObject.typesMod.ComputedPropertyGetterObj[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[typings.emberObject.typesMod.ComputedPropertyGetterObj[T]]
    }
    
    @scala.inline
    def ComputedPropertySetterObj[T](set: (String, T) => T): typings.emberObject.typesMod.ComputedPropertySetterObj[T] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[typings.emberObject.typesMod.ComputedPropertySetterObj[T]]
    }
  }
}
