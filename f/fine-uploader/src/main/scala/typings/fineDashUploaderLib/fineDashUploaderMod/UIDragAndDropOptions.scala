package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UIDragAndDropOptions extends js.Object {
  /**
           * Designate additional drop zones for file input
           *
           * @default `[]`
           */
  var extraDropzones: js.UndefOr[js.Array[_]] = js.undefined
  /**
           * Include the path of dropped files (starting with the top-level dropped directory). This value will be sent along with the request as a qqpath parameter
           *
           * @default `false`
           */
  var reportDirectoryPaths: js.UndefOr[scala.Boolean] = js.undefined
}

