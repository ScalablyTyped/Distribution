package typings.atFirebaseComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atFirebaseComponent.distSrcComponentUnderscoreContainerMod.ComponentContainer

  type Dictionary = StringDictionary[js.Any]
  type InstanceFactory[T /* <: Name */] = js.Function2[
    /* container */ ComponentContainer, 
    /* instanceIdentifier */ js.UndefOr[String], 
    /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any
  ]
  type Service = js.Object
}
