package typings.firebaseComponent

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseComponent.componentContainerMod.ComponentContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
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
  
  type Dictionary = StringDictionary[js.Any]
  
  type InstanceFactory[T /* <: Name */] = js.Function2[
    /* container */ ComponentContainer, 
    /* instanceIdentifier */ js.UndefOr[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseComponent.firebaseComponentStrings.LAZY
    - typings.firebaseComponent.firebaseComponentStrings.EAGER
  */
  trait InstantiationMode extends StObject
  object InstantiationMode {
    
    inline def EAGER: typings.firebaseComponent.firebaseComponentStrings.EAGER = "EAGER".asInstanceOf[typings.firebaseComponent.firebaseComponentStrings.EAGER]
    
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
  
  /* Inlined @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[@firebase/component.@firebase/component/dist/src/types.Name] */
  type Service = scala.Nothing
}
