package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMap extends Widget {
  /** @name dxMap.addMarker(markerOptions) */
  def addMarker(markerOptions: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def addMarker(markerOptions: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  /** @name dxMap.addRoute(routeOptions) */
  def addRoute(options: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def addRoute(options: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  /** @name dxMap.removeMarker(marker) */
  def removeMarker(marker: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeMarker(marker: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeMarker(marker: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxMap.removeRoute(route) */
  def removeRoute(route: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeRoute(route: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeRoute(route: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
}

