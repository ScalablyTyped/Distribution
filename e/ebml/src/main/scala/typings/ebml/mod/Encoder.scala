package typings.ebml.mod

import typings.ebml.anon.PickTagStackItemend
import typings.ebml.mod.Encoder.TagStackItem
import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.node.streamMod.TransformOptions
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ebml", "Encoder")
@js.native
class Encoder () extends Transform {
  def this(opts: TransformOptions) = this()
  
  var buffer: Buffer = js.native
  
  var corked: Boolean = js.native
  
  def endTag(): Unit = js.native
  
  var stack: js.Array[TagStackItem] = js.native
  
  /**
    * @param tagName The name of the tag to start
    * @param info an information object with an `end` parameter
    */
  @JSName("startTag")
  def startTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    info: PickTagStackItemend
  ): Unit = js.native
  
  @JSName("writeTag")
  def writeTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    tagData: Buffer
  ): Unit = js.native
}
/* static members */
object Encoder {
  
  /**
    * gets the ID of the type of `tagName`
    * @param tagName tag name to be looked up
    * @return tag ID
    */
  @JSImport("ebml", "Encoder.getSchemaInfo")
  @js.native
  def getSchemaInfo(tagName: String): Double | Null = js.native
  
  @js.native
  trait TagStackItem extends StObject {
    
    var children: js.Array[TagStackItem] = js.native
    
    var data: Buffer | Null = js.native
    
    var end: Double = js.native
    
    var id: ReturnType[js.Function1[/* tagName */ String, Double | Null]] = js.native
    
    var name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any = js.native
  }
  object TagStackItem {
    
    @scala.inline
    def apply(
      children: js.Array[TagStackItem],
      end: Double,
      id: ReturnType[js.Function1[/* tagName */ String, Double | Null]],
      name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
    ): TagStackItem = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagStackItem]
    }
    
    @scala.inline
    implicit class TagStackItemMutableBuilder[Self <: TagStackItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[TagStackItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: TagStackItem*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataNull: Self = StObject.set(x, "data", null)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: ReturnType[js.Function1[/* tagName */ String, Double | Null]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
