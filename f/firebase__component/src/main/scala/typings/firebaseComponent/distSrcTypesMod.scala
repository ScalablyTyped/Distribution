package typings.firebaseComponent

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseComponent.distSrcComponentContainerMod.ComponentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseComponent.firebaseComponentStrings.PUBLIC
    - typings.firebaseComponent.firebaseComponentStrings.PRIVATE
    - typings.firebaseComponent.firebaseComponentStrings.VERSION
  */
  trait ComponentType extends StObject
  object ComponentType {
    
    inline def PRIVATE: typings.firebaseComponent.firebaseComponentStrings.PRIVATE = "PRIVATE".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.PRIVATE]
    
    inline def PUBLIC: typings.firebaseComponent.firebaseComponentStrings.PUBLIC = "PUBLIC".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.PUBLIC]
    
    inline def VERSION: typings.firebaseComponent.firebaseComponentStrings.VERSION = "VERSION".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.VERSION]
  }
  
  type Dictionary = StringDictionary[Any]
  
  type InitializeOptions = InstanceFactoryOptions
  
  type InstanceFactory[T /* <: Name */] = js.Function2[
    /* container */ ComponentContainer, 
    /* options */ InstanceFactoryOptions, 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
  ]
  
  trait InstanceFactoryOptions extends StObject {
    
    var instanceIdentifier: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object InstanceFactoryOptions {
    
    inline def apply(): InstanceFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstanceFactoryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InstanceFactoryOptions] (val x: Self) extends AnyVal {
      
      inline def setInstanceIdentifier(value: String): Self = StObject.set(x, "instanceIdentifier", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdentifierUndefined: Self = StObject.set(x, "instanceIdentifier", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseComponent.firebaseComponentStrings.LAZY
    - typings.firebaseComponent.firebaseComponentStrings.EAGER
    - typings.firebaseComponent.firebaseComponentStrings.EXPLICIT
  */
  trait InstantiationMode extends StObject
  object InstantiationMode {
    
    inline def EAGER: typings.firebaseComponent.firebaseComponentStrings.EAGER = "EAGER".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.EAGER]
    
    inline def EXPLICIT: typings.firebaseComponent.firebaseComponentStrings.EXPLICIT = "EXPLICIT".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.EXPLICIT]
    
    inline def LAZY: typings.firebaseComponent.firebaseComponentStrings.LAZY = "LAZY".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.LAZY]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseComponent.firebaseComponentStrings.rocket
    - typings.firebaseComponent.firebaseComponentStrings.ship
    - typings.firebaseComponent.firebaseComponentStrings.fireball
    - typings.firebaseComponent.firebaseComponentStrings.test
    - typings.firebaseComponent.firebaseComponentStrings.badtest
  */
  trait Name extends StObject
  
  trait NameServiceMapping extends StObject
  
  type OnInitCallBack[T /* <: Name */] = js.Function2[
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ /* instance */ js.Any, 
    /* identifier */ String, 
    Unit
  ]
  
  /* Inlined @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[@firebase/component.@firebase/component/dist/src/types.Name] */
  type Service = scala.Nothing
  
  type onInstanceCreatedCallback[T /* <: Name */] = js.Function3[
    /* container */ ComponentContainer, 
    /* instanceIdentifier */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ /* instance */ js.Any, 
    Unit
  ]
}
