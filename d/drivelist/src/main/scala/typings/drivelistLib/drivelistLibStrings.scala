package typings
package drivelistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object drivelistLibStrings {
  @js.native
  sealed trait ATA
    extends drivelistLib.drivelistMod.BusType
  
  @js.native
  sealed trait IDE
    extends drivelistLib.drivelistMod.BusType
  
  @js.native
  sealed trait PCI
    extends drivelistLib.drivelistMod.BusType
  
  @js.native
  sealed trait SATA
    extends drivelistLib.drivelistMod.BusType
  
  @js.native
  sealed trait SCSI
    extends drivelistLib.drivelistMod.BusType
  
  @js.native
  sealed trait UNKNOWN
    extends drivelistLib.drivelistMod.BusType
  
  @scala.inline
  def ATA: ATA = "ATA".asInstanceOf[ATA]
  @scala.inline
  def IDE: IDE = "IDE".asInstanceOf[IDE]
  @scala.inline
  def PCI: PCI = "PCI".asInstanceOf[PCI]
  @scala.inline
  def SATA: SATA = "SATA".asInstanceOf[SATA]
  @scala.inline
  def SCSI: SCSI = "SCSI".asInstanceOf[SCSI]
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
}

