package typings.eqJs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Element
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.NodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eq_ {
  
  type AvailableElementType = HTMLElement | HTMLCollectionOf[Element] | js.Array[HTMLElement] | NodeList | JQuery
  
  trait EqjsKeyValuePair extends StObject {
    
    var key: String
    
    var value: Double
  }
  object EqjsKeyValuePair {
    
    inline def apply(key: String, value: Double): EqjsKeyValuePair = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EqjsKeyValuePair]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EqjsKeyValuePair] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type EqjsNodesTable = NumberDictionary[HTMLElement]
  
  @js.native
  trait EqjsStatic extends StObject {
    
    /**
      * Runs through all nodes and writes their eq status.
      * @param nodes An array or NodeList of nodes to query
      * @returns {}
      */
    def nodeWrites(): Unit = js.native
    def nodeWrites(nodes: AvailableElementType): Unit = js.native
    
    /**
      * List of all nodes.
      */
    var nodes: EqjsNodesTable = js.native
    
    /**
      * Number of nodes in eqjs.nodes.
      */
    var nodesLength: Double = js.native
    
    /**
      * Runs through all nodes and finds their widths and points
      * @param nodes
      * @param callback function to use as a callback once query and nodeWrites have finished
      */
    def query(nodes: AvailableElementType): Unit = js.native
    def query(nodes: AvailableElementType, callback: js.Function): Unit = js.native
    
    /**
      *  Refreshes the list of nodes for eqjs to work with
      */
    def refreshNodes(): Unit = js.native
    
    /**
      * Sorts a simple object (key: value) by value and returns a sorted object.
      * @param obj e.g. "small: 380, medium: 490, large: 600"
      * @returns {}
      */
    def sortObj(obj: String): js.Array[EqjsKeyValuePair] = js.native
  }
}
