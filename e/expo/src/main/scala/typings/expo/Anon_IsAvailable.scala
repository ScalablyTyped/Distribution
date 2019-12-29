package typings.expo

import typings.expo.buildUpdatesUpdatesMod.Manifest
import typings.expo.buildUpdatesUpdatesMod.UpdateCheckResult
import typings.expo.expoBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsAvailable extends UpdateCheckResult {
  var isAvailable: `true`
  var manifest: Manifest
}

object Anon_IsAvailable {
  @scala.inline
  def apply(isAvailable: `true`, manifest: Manifest): Anon_IsAvailable = {
    val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsAvailable]
  }
}

