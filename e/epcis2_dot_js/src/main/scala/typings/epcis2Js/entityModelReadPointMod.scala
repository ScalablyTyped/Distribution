package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelReadPointMod {
  
  @JSImport("epcis2.js/entity/model/ReadPoint", JSImport.Default)
  @js.native
  open class default () extends ReadPoint
  
  @js.native
  trait ReadPoint
    extends typings.epcis2Js.entityEntityMod.default {
    
    /**
      * Getter for the id property
      */
    def getId(): String = js.native
    
    /**
      * Set the id property
      * @return the readPoint instance
      */
    def setId(id: String): ReadPoint = js.native
  }
}
