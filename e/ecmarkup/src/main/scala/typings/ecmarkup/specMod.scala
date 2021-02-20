package typings.ecmarkup

import typings.ecmarkup.ecmarkupStrings.attr
import typings.ecmarkup.ecmarkupStrings.contents
import typings.ecmarkup.ecmarkupStrings.global
import typings.ecmarkup.ecmarkupStrings.node
import typings.ecmarkup.ecmarkupStrings.raw
import typings.ecmarkup.mod.Options
import typings.std.Element
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object specMod {
  
  @js.native
  trait Spec extends StObject {
    
    def exportBiblio(): js.Any = js.native
    
    var namespace: String = js.native
    
    var opts: Options = js.native
    
    var rootDir: String = js.native
    
    var rootPath: String = js.native
    
    var spec: this.type = js.native
    
    def toHTML(): String = js.native
  }
  object Spec {
    
    @scala.inline
    def apply(
      exportBiblio: () => js.Any,
      namespace: String,
      opts: Options,
      rootDir: String,
      rootPath: String,
      spec: Spec,
      toHTML: () => String
    ): Spec = {
      val __obj = js.Dynamic.literal(exportBiblio = js.Any.fromFunction0(exportBiblio), namespace = namespace.asInstanceOf[js.Any], opts = opts.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], toHTML = js.Any.fromFunction0(toHTML))
      __obj.asInstanceOf[Spec]
    }
    
    @scala.inline
    implicit class SpecMutableBuilder[Self <: Spec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportBiblio(value: () => js.Any): Self = StObject.set(x, "exportBiblio", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpts(value: Options): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToHTML(value: () => String): Self = StObject.set(x, "toHTML", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.Message
    - typings.ecmarkup.anon.Node
    - typings.ecmarkup.anon.Attr
    - typings.ecmarkup.anon.NodeRelativeColumn
    - typings.ecmarkup.anon.Column
  */
  trait Warning extends StObject
  object Warning {
    
    @scala.inline
    def Attr(attr: String, message: String, node: Element, ruleId: String, `type`: attr): typings.ecmarkup.anon.Attr = {
      val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Attr]
    }
    
    @scala.inline
    def Column(column: Double, line: Double, message: String, ruleId: String, `type`: raw): typings.ecmarkup.anon.Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Column]
    }
    
    @scala.inline
    def Message(message: String, ruleId: String, `type`: global): typings.ecmarkup.anon.Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Message]
    }
    
    @scala.inline
    def Node(message: String, node: Text | Element, ruleId: String, `type`: node): typings.ecmarkup.anon.Node = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Node]
    }
    
    @scala.inline
    def NodeRelativeColumn(
      message: String,
      node: Text | Element,
      nodeRelativeColumn: Double,
      nodeRelativeLine: Double,
      ruleId: String,
      `type`: contents
    ): typings.ecmarkup.anon.NodeRelativeColumn = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodeRelativeColumn = nodeRelativeColumn.asInstanceOf[js.Any], nodeRelativeLine = nodeRelativeLine.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.NodeRelativeColumn]
    }
  }
}
