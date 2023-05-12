package typings.editorconfig

import org.scalablytyped.runtime.StringDictionary
import typings.editorconfig.editorconfigBooleans.`false`
import typings.editorconfig.editorconfigBooleans.`true`
import typings.editorconfig.editorconfigStrings.crlf
import typings.editorconfig.editorconfigStrings.lf
import typings.editorconfig.editorconfigStrings.space
import typings.editorconfig.editorconfigStrings.tab
import typings.editorconfig.editorconfigStrings.unset
import typings.minimatch.mod.Minimatch_
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("editorconfig/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(filepath: String): js.Promise[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Props]]
  inline def parse(filepath: String, options: ParseOptions): js.Promise[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Props]]
  
  inline def parseBuffer(data: Buffer): ParseStringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[ParseStringResult]
  
  inline def parseFromFiles(filepath: String, files: js.Promise[js.Array[ECFile]]): js.Promise[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFiles")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Props]]
  inline def parseFromFiles(filepath: String, files: js.Promise[js.Array[ECFile]], options: ParseOptions): js.Promise[Props] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFiles")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Props]]
  
  inline def parseFromFilesSync(filepath: String, files: js.Array[ECFile]): Props = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFilesSync")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[Props]
  inline def parseFromFilesSync(filepath: String, files: js.Array[ECFile], options: ParseOptions): Props = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFilesSync")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Props]
  
  inline def parseString(data: String): ParseStringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[ParseStringResult]
  
  inline def parseSync(filepath: String): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(filepath.asInstanceOf[js.Any]).asInstanceOf[Props]
  inline def parseSync(filepath: String, options: ParseOptions): Props = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Props]
  
  trait Cache extends StObject {
    
    def get(path: String): js.UndefOr[ProcessedFileConfig]
    
    def set(path: String, config: ProcessedFileConfig): this.type
  }
  object Cache {
    
    inline def apply(get: String => js.UndefOr[ProcessedFileConfig], set: (String, ProcessedFileConfig) => Cache): Cache = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Cache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cache] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => js.UndefOr[ProcessedFileConfig]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, ProcessedFileConfig) => Cache): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait ECFile extends StObject {
    
    var contents: js.UndefOr[Buffer] = js.undefined
    
    var name: String
  }
  object ECFile {
    
    inline def apply(name: String): ECFile = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECFile]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ECFile] (val x: Self) extends AnyVal {
      
      inline def setContents(value: Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type GlobbedProps = js.Array[js.Tuple3[SectionName, Props, SectionGlob]]
  
  trait KnownProps extends StObject {
    
    var charset: js.UndefOr[String | unset] = js.undefined
    
    var end_of_line: js.UndefOr[lf | crlf | unset] = js.undefined
    
    var indent_size: js.UndefOr[Double | tab | unset] = js.undefined
    
    var indent_style: js.UndefOr[tab | space | unset] = js.undefined
    
    var insert_final_newline: js.UndefOr[`true` | `false` | unset] = js.undefined
    
    var tab_width: js.UndefOr[Double | unset] = js.undefined
    
    var trim_trailing_whitespace: js.UndefOr[`true` | `false` | unset] = js.undefined
  }
  object KnownProps {
    
    inline def apply(): KnownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KnownProps] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String | unset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setEnd_of_line(value: lf | crlf | unset): Self = StObject.set(x, "end_of_line", value.asInstanceOf[js.Any])
      
      inline def setEnd_of_lineUndefined: Self = StObject.set(x, "end_of_line", js.undefined)
      
      inline def setIndent_size(value: Double | tab | unset): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      inline def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      inline def setIndent_style(value: tab | space | unset): Self = StObject.set(x, "indent_style", value.asInstanceOf[js.Any])
      
      inline def setIndent_styleUndefined: Self = StObject.set(x, "indent_style", js.undefined)
      
      inline def setInsert_final_newline(value: `true` | `false` | unset): Self = StObject.set(x, "insert_final_newline", value.asInstanceOf[js.Any])
      
      inline def setInsert_final_newlineUndefined: Self = StObject.set(x, "insert_final_newline", js.undefined)
      
      inline def setTab_width(value: Double | unset): Self = StObject.set(x, "tab_width", value.asInstanceOf[js.Any])
      
      inline def setTab_widthUndefined: Self = StObject.set(x, "tab_width", js.undefined)
      
      inline def setTrim_trailing_whitespace(value: `true` | `false` | unset): Self = StObject.set(x, "trim_trailing_whitespace", value.asInstanceOf[js.Any])
      
      inline def setTrim_trailing_whitespaceUndefined: Self = StObject.set(x, "trim_trailing_whitespace", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var cache: js.UndefOr[Cache] = js.undefined
    
    var config: js.UndefOr[String] = js.undefined
    
    var files: js.UndefOr[js.Array[Visited]] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setFiles(value: js.Array[Visited]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: Visited*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type ParseStringResult = js.Array[js.Tuple2[SectionName, SectionBody]]
  
  trait ProcessedFileConfig extends StObject {
    
    var config: GlobbedProps
    
    var name: String
    
    var notfound: js.UndefOr[`true`] = js.undefined
    
    var root: Boolean
  }
  object ProcessedFileConfig {
    
    inline def apply(config: GlobbedProps, name: String, root: Boolean): ProcessedFileConfig = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessedFileConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessedFileConfig] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: GlobbedProps): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigVarargs(value: (js.Tuple3[SectionName, Props, SectionGlob])*): Self = StObject.set(x, "config", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotfound(value: `true`): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
      
      inline def setNotfoundUndefined: Self = StObject.set(x, "notfound", js.undefined)
      
      inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props
    extends StObject
       with KnownProps
       with UnknownMap
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
  }
  
  type SectionBody = StringDictionary[String]
  
  type SectionGlob = Minimatch_ | Null
  
  type SectionName = String | Null
  
  type UnknownMap = StringDictionary[Any]
  
  trait Visited extends StObject {
    
    var fileName: String
    
    var glob: String
  }
  object Visited {
    
    inline def apply(fileName: String, glob: String): Visited = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any])
      __obj.asInstanceOf[Visited]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Visited] (val x: Self) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
    }
  }
}
