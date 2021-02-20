package typings.emberArray

import typings.emberArray.mutableMod.MutableArray
import typings.emberObject.copyableMod.Copyable
import typings.emberObject.observableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prototypeExtensionsMod {
  
  @js.native
  trait ArrayPrototypeExtensions[T]
    extends MutableArray[T]
       with Observable
       with Copyable
}
