package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelSensorSensorMetadataMod {
  
  @JSImport("epcis2.js/entity/model/sensor/SensorMetadata", JSImport.Default)
  @js.native
  open class default () extends SensorMetadata
  
  @js.native
  trait SensorMetadata
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Getter for the bizRules property
      */
    def getBizRules(): String = js.native
    
    /**
      * Getter for the dataProcessingMethod property
      */
    def getDataProcessingMethod(): String = js.native
    
    /**
      * Getter for the deviceID property
      */
    def getDeviceID(): String = js.native
    
    /**
      * Getter for the deviceMetadata property
      */
    def getDeviceMetadata(): String = js.native
    
    /**
      * Getter for the endTime property
      */
    def getEndTime(): String = js.native
    
    /**
      * Getter for the rawData property
      */
    def getRawData(): String = js.native
    
    /**
      * Getter for the startTime property
      */
    def getStartTime(): String = js.native
    
    /**
      * Getter for the time property
      */
    def getTime(): String = js.native
    
    /**
      * Set the bizRules property
      * @return the sensorMetadata instance
      */
    def setBizRules(bizRules: String): SensorMetadata = js.native
    
    /**
      * Set the dataProcessingMethod property
      * @return the sensorMetadata instance
      */
    def setDataProcessingMethod(dataProcessingMethod: String): SensorMetadata = js.native
    
    /**
      * Set the deviceID property
      * @return the sensorMetadata instance
      */
    def setDeviceID(deviceID: String): SensorMetadata = js.native
    
    /**
      * Set the deviceMetadata property
      * @return the sensorMetadata instance
      */
    def setDeviceMetadata(deviceMetadata: String): SensorMetadata = js.native
    
    /**
      * Set the endTime property
      * @return the sensorMetadata instance
      */
    def setEndTime(endTime: String): SensorMetadata = js.native
    
    /**
      * Set the rawData property
      * @return the sensorMetadata instance
      */
    def setRawData(rawData: String): SensorMetadata = js.native
    
    /**
      * Set the startTime property
      * @return the sensorMetadata instance
      */
    def setStartTime(startTime: String): SensorMetadata = js.native
    
    /**
      * Set the time property
      * @return the sensorMetadata instance
      */
    def setTime(time: String): SensorMetadata = js.native
  }
}
