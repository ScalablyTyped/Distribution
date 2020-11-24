package typings.geodesy.utmMod

import typings.geodesy.mod.Datum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geodesy/utm", "default")
@js.native
class default protected () extends Utm {
  def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double) = this()
  def this(zone: Double, hemisphere: Hemisphere, easting: Double, northing: Double, datum: Datum) = this()
  def this(
    zone: Double,
    hemisphere: Hemisphere,
    easting: Double,
    northing: Double,
    datum: js.UndefOr[scala.Nothing],
    convergence: Double
  ) = this()
  def this(
    zone: Double,
    hemisphere: Hemisphere,
    easting: Double,
    northing: Double,
    datum: Datum,
    convergence: Double
  ) = this()
  def this(
    zone: Double,
    hemisphere: Hemisphere,
    easting: Double,
    northing: Double,
    datum: js.UndefOr[scala.Nothing],
    convergence: js.UndefOr[scala.Nothing],
    scale: Double
  ) = this()
  def this(
    zone: Double,
    hemisphere: Hemisphere,
    easting: Double,
    northing: Double,
    datum: js.UndefOr[scala.Nothing],
    convergence: Double,
    scale: Double
  ) = this()
  def this(
    zone: Double,
    hemisphere: Hemisphere,
    easting: Double,
    northing: Double,
    datum: Datum,
    convergence: js.UndefOr[scala.Nothing],
    scale: Double
  ) = this()
  def this(
    zone: Double,
    hemisphere: Hemisphere,
    easting: Double,
    northing: Double,
    datum: Datum,
    convergence: Double,
    scale: Double
  ) = this()
}
/* static members */
@JSImport("geodesy/utm", "default")
@js.native
object default extends js.Object {
  
  def parse(utmCoord: String): Utm = js.native
  def parse(utmCoord: String, datum: Datum): Utm = js.native
}
