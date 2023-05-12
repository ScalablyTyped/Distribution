package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.MVCArray")
@js.native
/**
  * Access by calling `const {MVCArray} = await
  * google.maps.importLibrary("core")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class MVCArray[T] ()
  extends StObject
     with typings.googleMaps.google.maps.MVCArray[T] {
  def this(array: js.Array[T]) = this()
}
