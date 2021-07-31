package typings.drivelist

import typings.drivelist.mod.BusType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drivelistStrings {
  
  @js.native
  sealed trait ATA
    extends StObject
       with BusType
  @scala.inline
  def ATA: ATA = "ATA".asInstanceOf[ATA]
  
  @js.native
  sealed trait IDE
    extends StObject
       with BusType
  @scala.inline
  def IDE: IDE = "IDE".asInstanceOf[IDE]
  
  @js.native
  sealed trait PCI
    extends StObject
       with BusType
  @scala.inline
  def PCI: PCI = "PCI".asInstanceOf[PCI]
  
  @js.native
  sealed trait SATA
    extends StObject
       with BusType
  @scala.inline
  def SATA: SATA = "SATA".asInstanceOf[SATA]
  
  @js.native
  sealed trait SCSI
    extends StObject
       with BusType
  @scala.inline
  def SCSI: SCSI = "SCSI".asInstanceOf[SCSI]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with BusType
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
}
