package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxMap extends Widget {
  
  /**
    * [descr:dxMap.addMarker(markerOptions)]
    */
  def addMarker(markerOptions: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def addMarker(markerOptions: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:dxMap.addRoute(routeOptions)]
    */
  def addRoute(options: js.Any): Promise[_] with JQueryPromise[_] = js.native
  def addRoute(options: js.Array[_]): Promise[_] with JQueryPromise[_] = js.native
  
  /**
    * [descr:dxMap.removeMarker(marker)]
    */
  def removeMarker(marker: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeMarker(marker: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeMarker(marker: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxMap.removeRoute(route)]
    */
  def removeRoute(route: js.Any): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeRoute(route: js.Array[_]): Promise[Unit] with JQueryPromise[Unit] = js.native
  def removeRoute(route: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
}
