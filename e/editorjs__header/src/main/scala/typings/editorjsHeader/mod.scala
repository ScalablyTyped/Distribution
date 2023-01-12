package typings.editorjsHeader

import typings.editorjsHeader.anon.Api
import typings.editorjsHeader.editorjsHeaderStrings.h1
import typings.editorjsHeader.editorjsHeaderStrings.h2
import typings.editorjsHeader.editorjsHeaderStrings.h3
import typings.editorjsHeader.editorjsHeaderStrings.h4
import typings.editorjsHeader.editorjsHeaderStrings.h5
import typings.editorjsHeader.editorjsHeaderStrings.h6
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@editorjs/header", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Header {
    def this(config: Api) = this()
  }
  
  @js.native
  trait Header extends StObject {
    
    def currentLevel: Level = js.native
    
    def data: HeaderData = js.native
    def data_=(data: HeaderData): Unit = js.native
    
    def defaultLevel: Level = js.native
    
    def getTag(): HTMLElement = js.native
    
    def levels: js.Array[Level] = js.native
    
    def merge(data: HeaderData): Unit = js.native
    
    def normalizeData(data: HeaderData): HeaderData = js.native
    
    def save(toolsContent: HTMLElement): HeaderData = js.native
    
    def setLevel(level: Double): Unit = js.native
    
    def validate(blockData: HeaderData): Boolean = js.native
  }
  
  trait HeaderConfig extends StObject {
    
    var defaultLevel: Double
    
    var levels: js.Array[Double]
    
    var placeholder: String
  }
  object HeaderConfig {
    
    inline def apply(defaultLevel: Double, levels: js.Array[Double], placeholder: String): HeaderConfig = {
      val __obj = js.Dynamic.literal(defaultLevel = defaultLevel.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderConfig] (val x: Self) extends AnyVal {
      
      inline def setDefaultLevel(value: Double): Self = StObject.set(x, "defaultLevel", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: js.Array[Double]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsVarargs(value: Double*): Self = StObject.set(x, "levels", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  trait HeaderData extends StObject {
    
    var level: Double
    
    var text: String
  }
  object HeaderData {
    
    inline def apply(level: Double, text: String): HeaderData = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderData] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var number: Double
    
    var svg: String
    
    var tag: h1 | h2 | h3 | h4 | h5 | h6
  }
  object Level {
    
    inline def apply(number: Double, svg: String, tag: h1 | h2 | h3 | h4 | h5 | h6): Level = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
      
      inline def setTag(value: h1 | h2 | h3 | h4 | h5 | h6): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
}
