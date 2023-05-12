package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelSensorSensorElementMod {
  
  @JSImport("epcis2.js/entity/model/sensor/SensorElement", JSImport.Default)
  @js.native
  open class default () extends SensorElement
  
  @js.native
  trait SensorElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Add the sensorReport to the "sensorReportList" field
      * @param sensorReport - the sensorReport to add
      * @return the objectEvent instance
      */
    def addSensorReport(sensorReport: typings.epcis2Js.entityModelSensorSensorReportElementMod.default): SensorElement = js.native
    
    /**
      * Add each sensorReportElement to the "sensorReportList" field
      * @param sensorReportList - the sensorReports to add
      * @return the objectEvent instance
      */
    def addSensorReportList(sensorReportList: js.Array[typings.epcis2Js.entityModelSensorSensorReportElementMod.default]): SensorElement = js.native
    
    /**
      * Clear the sensorReport list
      * @return the objectEvent instance
      */
    def clearSensorReportList(): SensorElement = js.native
    
    /**
      * Getter for the sensorMetadata property
      */
    def getSensorMetadata(): typings.epcis2Js.entityModelSensorSensorMetadataMod.default = js.native
    
    /**
      * Getter for the sensorReport property
      */
    def getSensorReport(): typings.epcis2Js.entityModelSensorSensorReportElementMod.default = js.native
    
    /**
      * Remove a sensorReport from the "sensorReportList" field
      * @param sensorReport - the sensorReport to remove
      * @return the objectEvent instance
      */
    def removeSensorReport(sensorReport: typings.epcis2Js.entityModelSensorSensorReportElementMod.default): SensorElement = js.native
    
    /**
      * Remove each sensorReport from the "sensorReportList" field
      * @param sensorReportList - the sensorReports to remove
      * @return the objectEvent instance
      */
    def removeSensorReportList(sensorReportList: js.Array[typings.epcis2Js.entityModelSensorSensorReportElementMod.default]): SensorElement = js.native
    
    var sensorReport: Any = js.native
    
    /**
      * Set the sensorMetadata property
      * @return the sensor instance
      */
    def setSensorMetadata(sensorMetadata: typings.epcis2Js.entityModelSensorSensorMetadataMod.default): SensorElement = js.native
  }
}
