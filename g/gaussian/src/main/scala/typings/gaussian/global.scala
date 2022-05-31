package typings.gaussian

import typings.gaussian.mod.Gaussian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def gaussian(mean: Double, variance: Double): Gaussian = (js.Dynamic.global.applyDynamic("gaussian")(mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[Gaussian]
}
