package typings.expoConfigureSplashScreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object xmlManipulationMod {
  
  type ExpectedElementAttributes = typings.std.Record[
    java.lang.String, 
    typings.expoConfigureSplashScreen.xmlManipulationMod.WithExplicitNewValue[js.UndefOr[java.lang.String | scala.Double]]
  ]
  
  type ExpectedElements = typings.expoConfigureSplashScreen.xmlManipulationMod.WithExplicitNewValue[
    js.Array[
      typings.expoConfigureSplashScreen.xmlManipulationMod.WithExplicitIndex[
        typings.expoConfigureSplashScreen.xmlManipulationMod.WithDeletionFlag[typings.expoConfigureSplashScreen.xmlManipulationMod.ExpectedElement]
      ]
    ]
  ]
  
  type WithDeletionFlag[T] = T with typings.expoConfigureSplashScreen.anon.DeletionFlag
  
  type WithExplicitIndex[T] = T with typings.expoConfigureSplashScreen.anon.Idx
  
  type WithExplicitNewValue[T] = T | typings.expoConfigureSplashScreen.xmlManipulationMod.ExplicitNewValue[T]
}
