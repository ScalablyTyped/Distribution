package typings.globule

import org.scalablytyped.runtime.Shortcut
import typings.glob.mod.IOptions
import typings.globule.globuleStrings.first
import typings.globule.globuleStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("globule", JSImport.Namespace)
  @js.native
  val ^ : GlobuleStatic = js.native
  
  trait FindOptions
    extends StObject
       with IOptions {
    
    var filter: js.UndefOr[
        String | (js.Function2[/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], Boolean])
      ] = js.undefined
    
    var prefixBase: js.UndefOr[Boolean] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var srcBase: js.UndefOr[String] = js.undefined
  }
  object FindOptions {
    
    inline def apply(): FindOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOptions]
    }
    
    extension [Self <: FindOptions](x: Self) {
      
      inline def setFilter(
        value: String | (js.Function2[/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any], Boolean])
      ): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterFunction2(value: (/* filepath */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPrefixBase(value: Boolean): Self = StObject.set(x, "prefixBase", value.asInstanceOf[js.Any])
      
      inline def setPrefixBaseUndefined: Self = StObject.set(x, "prefixBase", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcBase(value: String): Self = StObject.set(x, "srcBase", value.asInstanceOf[js.Any])
      
      inline def setSrcBaseUndefined: Self = StObject.set(x, "srcBase", js.undefined)
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
  
  @js.native
  trait GlobuleStatic extends StObject {
    
    /**
      * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
      */
    def find(options: FindOptions): js.Array[String] = js.native
    /**
      * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
      */
    def find(pattern: String): js.Array[String] = js.native
    def find(pattern: String, options: FindOptions): js.Array[String] = js.native
    /**
      * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
      */
    def find(pattern: String, pattern2: String): js.Array[String] = js.native
    def find(pattern: String, pattern2: String, options: FindOptions): js.Array[String] = js.native
    /**
      * Returns a unique array of all file or directory paths that match the given globbing pattern(s)
      */
    def find(pattern: String, pattern2: String, pattern3: String): js.Array[String] = js.native
    def find(pattern: String, pattern2: String, pattern3: String, options: FindOptions): js.Array[String] = js.native
    def find(pattern: String, pattern2: String, pattern3: js.Array[String]): js.Array[String] = js.native
    def find(pattern: String, pattern2: String, pattern3: js.Array[String], options: FindOptions): js.Array[String] = js.native
    def find(pattern: String, pattern2: js.Array[String]): js.Array[String] = js.native
    def find(pattern: String, pattern2: js.Array[String], options: FindOptions): js.Array[String] = js.native
    def find(pattern: js.Array[String]): js.Array[String] = js.native
    def find(pattern: js.Array[String], options: FindOptions): js.Array[String] = js.native
    def find(pattern: js.Array[String], pattern2: String): js.Array[String] = js.native
    def find(pattern: js.Array[String], pattern2: String, options: FindOptions): js.Array[String] = js.native
    def find(pattern: js.Array[String], pattern2: js.Array[String]): js.Array[String] = js.native
    def find(pattern: js.Array[String], pattern2: js.Array[String], options: FindOptions): js.Array[String] = js.native
    
    /**
      * Tests pattern(s) against against one or more file paths and returns true if any files were matched, otherwise false.
      */
    def isMatch(patterns: String, filepaths: String): Boolean = js.native
    def isMatch(patterns: String, filepaths: String, options: typings.minimatch.mod.IOptions): Boolean = js.native
    def isMatch(patterns: String, filepaths: js.Array[String]): Boolean = js.native
    def isMatch(patterns: String, filepaths: js.Array[String], options: typings.minimatch.mod.IOptions): Boolean = js.native
    def isMatch(patterns: js.Array[String], filepaths: String): Boolean = js.native
    def isMatch(patterns: js.Array[String], filepaths: String, options: typings.minimatch.mod.IOptions): Boolean = js.native
    def isMatch(patterns: js.Array[String], filepaths: js.Array[String]): Boolean = js.native
    def isMatch(patterns: js.Array[String], filepaths: js.Array[String], options: typings.minimatch.mod.IOptions): Boolean = js.native
    
    /**
      * Given a set of source file paths, returns an array of src-dest file mapping objects
      */
    def mapping(filepaths: js.Array[String]): js.Array[OneMapping] = js.native
    /**
      * Given a set of source file paths, returns an array of src-dest file mapping objects
      */
    def mapping(filepaths: js.Array[String], filepaths2: js.Array[String]): js.Array[OneMapping] = js.native
    /**
      * Given a set of source file paths, returns an array of src-dest file mapping objects
      */
    def mapping(filepaths: js.Array[String], filepaths2: js.Array[String], filepaths3: js.Array[String]): js.Array[OneMapping] = js.native
    def mapping(
      filepaths: js.Array[String],
      filepaths2: js.Array[String],
      filepaths3: js.Array[String],
      options: MappingOptions
    ): js.Array[OneMapping] = js.native
    def mapping(filepaths: js.Array[String], filepaths2: js.Array[String], options: MappingOptions): js.Array[OneMapping] = js.native
    def mapping(filepaths: js.Array[String], options: MappingOptions): js.Array[OneMapping] = js.native
    /**
      * Given a set of source file paths, returns an array of src-dest file mapping objects
      */
    def mapping(options: MappingOptions): js.Array[OneMapping] = js.native
    
    /**
      * Match one or more globbing patterns against one or more file paths.
      * Returns a uniqued array of all file paths that match any of the specified globbing patterns.
      */
    def `match`(patterns: String, filepaths: String): js.Array[String] = js.native
    def `match`(patterns: String, filepaths: String, options: typings.minimatch.mod.IOptions): js.Array[String] = js.native
    def `match`(patterns: String, filepaths: js.Array[String]): js.Array[String] = js.native
    def `match`(patterns: String, filepaths: js.Array[String], options: typings.minimatch.mod.IOptions): js.Array[String] = js.native
    def `match`(patterns: js.Array[String], filepaths: String): js.Array[String] = js.native
    def `match`(patterns: js.Array[String], filepaths: String, options: typings.minimatch.mod.IOptions): js.Array[String] = js.native
    def `match`(patterns: js.Array[String], filepaths: js.Array[String]): js.Array[String] = js.native
    def `match`(patterns: js.Array[String], filepaths: js.Array[String], options: typings.minimatch.mod.IOptions): js.Array[String] = js.native
  }
  
  trait MappingOptions
    extends StObject
       with FindOptions {
    
    var destBase: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var extDot: js.UndefOr[first | last] = js.undefined
    
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    var rename: js.UndefOr[js.Function1[/* p */ String, String]] = js.undefined
  }
  object MappingOptions {
    
    inline def apply(): MappingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MappingOptions]
    }
    
    extension [Self <: MappingOptions](x: Self) {
      
      inline def setDestBase(value: String): Self = StObject.set(x, "destBase", value.asInstanceOf[js.Any])
      
      inline def setDestBaseUndefined: Self = StObject.set(x, "destBase", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtDot(value: first | last): Self = StObject.set(x, "extDot", value.asInstanceOf[js.Any])
      
      inline def setExtDotUndefined: Self = StObject.set(x, "extDot", js.undefined)
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      inline def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      inline def setRename(value: /* p */ String => String): Self = StObject.set(x, "rename", js.Any.fromFunction1(value))
      
      inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    }
  }
  
  trait OneMapping extends StObject {
    
    var dest: String
    
    var src: js.Array[String]
  }
  object OneMapping {
    
    inline def apply(dest: String, src: js.Array[String]): OneMapping = {
      val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[OneMapping]
    }
    
    extension [Self <: OneMapping](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: js.Array[String]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcVarargs(value: String*): Self = StObject.set(x, "src", js.Array(value :_*))
    }
  }
  
  type _To = GlobuleStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GlobuleStatic = ^
}
