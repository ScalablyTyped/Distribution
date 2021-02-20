package typings.enhancedResolve

import typings.enhancedResolve.concordMod.Concord
import typings.enhancedResolve.concordMod.Dictionary
import typings.enhancedResolve.resolverMod.^
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object descriptionFileUtilsMod {
  
  @JSImport("enhanced-resolve/lib/DescriptionFileUtils", "cdUp")
  @js.native
  def cdUp(directory: String): String | Null = js.native
  
  @JSImport("enhanced-resolve/lib/DescriptionFileUtils", "getField")
  @js.native
  def getField(content: Null, field: String): js.Any = js.native
  @JSImport("enhanced-resolve/lib/DescriptionFileUtils", "getField")
  @js.native
  def getField(content: Dictionary[_], field: String): js.Any = js.native
  
  @JSImport("enhanced-resolve/lib/DescriptionFileUtils", "loadDescriptionFile")
  @js.native
  def loadDescriptionFile(
    resolver: ^,
    directory: String,
    filenames: js.Array[String],
    callback: js.Function2[
      /* err */ js.UndefOr[Error | Null], 
      /* result */ js.UndefOr[LoadDescriptionFileResult], 
      _
    ]
  ): Unit = js.native
  
  @js.native
  trait DescriptionFileData extends StObject {
    
    var browser: js.UndefOr[Dictionary[String | Boolean]] = js.native
    
    var concord: js.UndefOr[Concord] = js.native
  }
  object DescriptionFileData {
    
    @scala.inline
    def apply(): DescriptionFileData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescriptionFileData]
    }
    
    @scala.inline
    implicit class DescriptionFileDataMutableBuilder[Self <: DescriptionFileData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: Dictionary[String | Boolean]): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setConcord(value: Concord): Self = StObject.set(x, "concord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcordUndefined: Self = StObject.set(x, "concord", js.undefined)
    }
  }
  
  @js.native
  trait LoadDescriptionFileResult extends StObject {
    
    var content: DescriptionFileData = js.native
    
    var directory: String = js.native
    
    var path: String = js.native
  }
  object LoadDescriptionFileResult {
    
    @scala.inline
    def apply(content: DescriptionFileData, directory: String, path: String): LoadDescriptionFileResult = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadDescriptionFileResult]
    }
    
    @scala.inline
    implicit class LoadDescriptionFileResultMutableBuilder[Self <: LoadDescriptionFileResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: DescriptionFileData): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
