package typings.editorjsHeader

import typings.editorjsHeader.mod.HeaderConfig
import typings.editorjsHeader.mod.HeaderData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: js.Object
    
    var config: HeaderConfig
    
    var data: HeaderData
    
    var readOnly: Boolean
  }
  object Api {
    
    inline def apply(api: js.Object, config: HeaderConfig, data: HeaderData, readOnly: Boolean): Api = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      inline def setApi(value: js.Object): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: HeaderConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setData(value: HeaderData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait Export extends StObject {
    
    var `export`: String
    
    var `import`: String
  }
  object Export {
    
    inline def apply(`export`: String, `import`: String): Export = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("export")(`export`.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Export]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Export] (val x: Self) extends AnyVal {
      
      inline def setExport(value: String): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setImport(value: String): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    }
  }
  
  trait Icon extends StObject {
    
    var icon: String
    
    var title: String
  }
  object Icon {
    
    inline def apply(icon: String, title: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var level: Boolean
    
    var text: js.Object
  }
  object Level {
    
    inline def apply(level: Boolean, text: js.Object): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setLevel(value: Boolean): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setText(value: js.Object): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
