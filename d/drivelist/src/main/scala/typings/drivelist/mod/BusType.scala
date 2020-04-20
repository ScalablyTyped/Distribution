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
  def ATA: typings.drivelist.drivelistStrings.ATA = "ATA".asInstanceOf[typings.drivelist.drivelistStrings.ATA]
  @scala.inline
  def IDE: typings.drivelist.drivelistStrings.IDE = "IDE".asInstanceOf[typings.drivelist.drivelistStrings.IDE]
  @scala.inline
  def PCI: typings.drivelist.drivelistStrings.PCI = "PCI".asInstanceOf[typings.drivelist.drivelistStrings.PCI]
  @scala.inline
  def SATA: typings.drivelist.drivelistStrings.SATA = "SATA".asInstanceOf[typings.drivelist.drivelistStrings.SATA]
  @scala.inline
  def SCSI: typings.drivelist.drivelistStrings.SCSI = "SCSI".asInstanceOf[typings.drivelist.drivelistStrings.SCSI]
  @scala.inline
  def UNKNOWN: typings.drivelist.drivelistStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.drivelist.drivelistStrings.UNKNOWN]
}

