package typings
package drivelistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object drivelistLibStrings {
  @js.native
  sealed trait ATA extends js.Object
  
  @js.native
  sealed trait IDE extends js.Object
  
  @js.native
  sealed trait PCI extends js.Object
  
  @js.native
  sealed trait SATA extends js.Object
  
  @js.native
  sealed trait SCSI extends js.Object
  
  @js.native
  sealed trait UNKNOWN extends js.Object
  
  def ATA: ATA = "ATA".asInstanceOf[ATA]
  def IDE: IDE = "IDE".asInstanceOf[IDE]
  def PCI: PCI = "PCI".asInstanceOf[PCI]
  def SATA: SATA = "SATA".asInstanceOf[SATA]
  def SCSI: SCSI = "SCSI".asInstanceOf[SCSI]
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
}

