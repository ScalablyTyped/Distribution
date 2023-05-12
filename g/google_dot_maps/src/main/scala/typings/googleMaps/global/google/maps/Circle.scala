package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.CircleLiteral
import typings.googleMaps.google.maps.CircleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Circle")
@js.native
/**
  * A circle on the Earth&#39;s surface; also known as a &quot;spherical
  * cap&quot;.
  *
  * Access by calling `const {Circle} = await
  * google.maps.importLibrary("maps")`. See
  * https://developers.google.com/maps/documentation/javascript/libraries.
  */
open class Circle ()
  extends StObject
     with typings.googleMaps.google.maps.Circle {
  def this(circleOrCircleOptions: typings.googleMaps.google.maps.Circle) = this()
  def this(circleOrCircleOptions: CircleLiteral) = this()
  def this(circleOrCircleOptions: CircleOptions) = this()
}
