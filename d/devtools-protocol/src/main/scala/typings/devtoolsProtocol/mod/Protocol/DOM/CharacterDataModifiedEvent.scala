package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacterDataModifiedEvent extends StObject {
  
  /**
    * New text value.
    */
  var characterData: String
  
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId
}
object CharacterDataModifiedEvent {
  
  inline def apply(characterData: String, nodeId: NodeId): CharacterDataModifiedEvent = {
    val __obj = js.Dynamic.literal(characterData = characterData.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterDataModifiedEvent]
  }
  
  extension [Self <: CharacterDataModifiedEvent](x: Self) {
    
    inline def setCharacterData(value: String): Self = StObject.set(x, "characterData", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
