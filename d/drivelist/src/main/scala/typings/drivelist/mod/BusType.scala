package typings.drivelist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.drivelist.drivelistStrings.SATA
  - typings.drivelist.drivelistStrings.SCSI
  - typings.drivelist.drivelistStrings.ATA
  - typings.drivelist.drivelistStrings.IDE
  - typings.drivelist.drivelistStrings.PCI
  - typings.drivelist.drivelistStrings.UNKNOWN
*/
trait BusType extends js.Object

object BusType {
  @scala.inline
  def ATA: typings.drivelist.drivelistStrings.ATA = this.cast("ATA")
  @scala.inline
  def IDE: typings.drivelist.drivelistStrings.IDE = this.cast("IDE")
  @scala.inline
  def PCI: typings.drivelist.drivelistStrings.PCI = this.cast("PCI")
  @scala.inline
  def SATA: typings.drivelist.drivelistStrings.SATA = this.cast("SATA")
  @scala.inline
  def SCSI: typings.drivelist.drivelistStrings.SCSI = this.cast("SCSI")
  @scala.inline
  def UNKNOWN: typings.drivelist.drivelistStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

