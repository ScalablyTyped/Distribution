package typings.gatsbyCoreUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteMetadataMod {
  
  @JSImport("gatsby-core-utils/dist/site-metadata", "getSiteMetadata")
  @js.native
  def getSiteMetadata(sitePath: String): js.Promise[ISiteMetadata | Null] = js.native
  
  @JSImport("gatsby-core-utils/dist/site-metadata", "updateSiteMetadata")
  @js.native
  def updateSiteMetadata(metadata: ISiteMetadata): js.Promise[Unit] = js.native
  @JSImport("gatsby-core-utils/dist/site-metadata", "updateSiteMetadata")
  @js.native
  def updateSiteMetadata(metadata: ISiteMetadata, merge: Boolean): js.Promise[Unit] = js.native
  
  @js.native
  trait ISiteMetadata extends StObject {
    
    var lastRun: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var pid: js.UndefOr[Double] = js.native
    
    var sitePath: String = js.native
  }
  object ISiteMetadata {
    
    @scala.inline
    def apply(sitePath: String): ISiteMetadata = {
      val __obj = js.Dynamic.literal(sitePath = sitePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISiteMetadata]
    }
    
    @scala.inline
    implicit class ISiteMetadataMutableBuilder[Self <: ISiteMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastRun(value: Double): Self = StObject.set(x, "lastRun", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastRunUndefined: Self = StObject.set(x, "lastRun", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
      
      @scala.inline
      def setSitePath(value: String): Self = StObject.set(x, "sitePath", value.asInstanceOf[js.Any])
    }
  }
}
