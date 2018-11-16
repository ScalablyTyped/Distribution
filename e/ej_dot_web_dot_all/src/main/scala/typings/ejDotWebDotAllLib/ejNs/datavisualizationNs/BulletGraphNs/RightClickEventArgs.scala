package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RightClickEventArgs extends js.Object {
  /** Set this option to true to cancel the event
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** location - X and Y co-ordinate of the points with respect to bullet graph area.id - ID of the target element.    size - Width and height of the bullet graph.    pageX -
               * x-coordinate of the pointer, relative to the page    pageY - y-coordinate of the pointer, relative to the page
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Instance of the bullet graph model object
               */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

