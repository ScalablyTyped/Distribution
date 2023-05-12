package typings.epcis2Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityModelSourceElementMod {
  
  @JSImport("epcis2.js/entity/model/SourceElement", JSImport.Default)
  @js.native
  open class default () extends SourceElement
  
  @js.native
  trait SourceElement
    extends typings.epcis2Js.entityEntityMod.default {
    
    def addExtension(): scala.Nothing = js.native
    
    /**
      * Getter for the source property
      */
    def getSource(): String = js.native
    
    /**
      * Getter for the type property
      */
    def getType(): String = js.native
    
    def removeExtension(): scala.Nothing = js.native
    
    /**
      * Set the source property
      * @return the source instance
      */
    def setSource(source: String): SourceElement = js.native
    
    /**
      * Set the type property
      * @return the source instance
      */
    def setType(`type`: String): SourceElement = js.native
  }
}
