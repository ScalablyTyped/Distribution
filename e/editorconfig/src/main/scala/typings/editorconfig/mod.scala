package typings.editorconfig

import typings.editorconfig.editorconfigBooleans.`false`
import typings.editorconfig.editorconfigBooleans.`true`
import typings.editorconfig.editorconfigStrings.crlf
import typings.editorconfig.editorconfigStrings.lf
import typings.editorconfig.editorconfigStrings.space
import typings.editorconfig.editorconfigStrings.tab
import typings.editorconfig.editorconfigStrings.unset
import typings.editorconfig.iniMod.ParseStringResult
import typings.editorconfig.iniMod.SectionBody
import typings.editorconfig.iniMod.SectionName
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("editorconfig/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(_filepath: String): js.Promise[KnownProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(_filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KnownProps]]
  @scala.inline
  def parse(_filepath: String, _options: ParseOptions): js.Promise[KnownProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(_filepath.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KnownProps]]
  
  @scala.inline
  def parseFromFiles(filepath: String, files: js.Promise[js.Array[ECFile]]): js.Promise[KnownProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFiles")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KnownProps]]
  @scala.inline
  def parseFromFiles(filepath: String, files: js.Promise[js.Array[ECFile]], options: ParseOptions): js.Promise[KnownProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFiles")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KnownProps]]
  
  @scala.inline
  def parseFromFilesSync(filepath: String, files: js.Array[ECFile]): KnownProps = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFilesSync")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[KnownProps]
  @scala.inline
  def parseFromFilesSync(filepath: String, files: js.Array[ECFile], options: ParseOptions): KnownProps = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFromFilesSync")(filepath.asInstanceOf[js.Any], files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[KnownProps]
  
  @scala.inline
  def parseString(data: String): ParseStringResult = ^.asInstanceOf[js.Dynamic].applyDynamic("parseString")(data.asInstanceOf[js.Any]).asInstanceOf[ParseStringResult]
  
  @scala.inline
  def parseSync(_filepath: String): KnownProps = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(_filepath.asInstanceOf[js.Any]).asInstanceOf[KnownProps]
  @scala.inline
  def parseSync(_filepath: String, _options: ParseOptions): KnownProps = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSync")(_filepath.asInstanceOf[js.Any], _options.asInstanceOf[js.Any])).asInstanceOf[KnownProps]
  
  trait ECFile extends StObject {
    
    var contents: String | Buffer
    
    var name: String
  }
  object ECFile {
    
    @scala.inline
    def apply(contents: String | Buffer, name: String): ECFile = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ECFile]
    }
    
    @scala.inline
    implicit class ECFileMutableBuilder[Self <: ECFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: String | Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileConfig extends StObject {
    
    var contents: ParseStringResult
    
    var name: String
  }
  object FileConfig {
    
    @scala.inline
    def apply(contents: ParseStringResult, name: String): FileConfig = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileConfig]
    }
    
    @scala.inline
    implicit class FileConfigMutableBuilder[Self <: FileConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: ParseStringResult): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsVarargs(value: (js.Tuple2[SectionName, SectionBody])*): Self = StObject.set(x, "contents", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    @scala.inline
    def apply(): KnownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KnownProps]
    }
    
    @scala.inline
    implicit class KnownPropsMutableBuilder[Self <: KnownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String | unset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setEnd_of_line(value: lf | crlf | unset): Self = StObject.set(x, "end_of_line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd_of_lineUndefined: Self = StObject.set(x, "end_of_line", js.undefined)
      
      @scala.inline
      def setIndent_size(value: Double | tab | unset): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      @scala.inline
      def setIndent_style(value: tab | space | unset): Self = StObject.set(x, "indent_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_styleUndefined: Self = StObject.set(x, "indent_style", js.undefined)
      
      @scala.inline
      def setInsert_final_newline(value: `true` | `false` | unset): Self = StObject.set(x, "insert_final_newline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsert_final_newlineUndefined: Self = StObject.set(x, "insert_final_newline", js.undefined)
      
      @scala.inline
      def setTab_width(value: Double | unset): Self = StObject.set(x, "tab_width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab_widthUndefined: Self = StObject.set(x, "tab_width", js.undefined)
      
      @scala.inline
      def setTrim_trailing_whitespace(value: `true` | `false` | unset): Self = StObject.set(x, "trim_trailing_whitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrim_trailing_whitespaceUndefined: Self = StObject.set(x, "trim_trailing_whitespace", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var config: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
