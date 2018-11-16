package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CameraOptions extends js.Object {
  /**
           * `null` allows camera access on the default button in iOS.
           *
           * Otherwise provide an extra button container element to target
           *
           * @default `null`
           */
  var button: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
           * Enable or disable camera access on iOS (iPod, iPhone, and iPad) devices.
           *
           * ###Note:
           * Enabling this will disable multiple file selection
           *
           * @default `false`
           */
  var ios: js.UndefOr[scala.Boolean] = js.undefined
}

