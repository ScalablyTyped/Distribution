package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryIdMod {
  
  @JSImport("gatsby-telemetry/lib/repository-id", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRepoMetadata(url: String): IRepositoryData | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepoMetadata")(url.asInstanceOf[js.Any]).asInstanceOf[IRepositoryData | Null]
  
  @scala.inline
  def getRepositoryId(): IRepositoryId = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepositoryId")().asInstanceOf[IRepositoryId]
  
  trait IRepositoryData extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var owner: js.UndefOr[String] = js.undefined
    
    var provider: String
  }
  object IRepositoryData {
    
    @scala.inline
    def apply(provider: String): IRepositoryData = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRepositoryData]
    }
    
    @scala.inline
    implicit class IRepositoryDataMutableBuilder[Self <: IRepositoryData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRepositoryId extends StObject {
    
    var repositoryData: js.UndefOr[IRepositoryData | Null] = js.undefined
    
    var repositoryId: String
  }
  object IRepositoryId {
    
    @scala.inline
    def apply(repositoryId: String): IRepositoryId = {
      val __obj = js.Dynamic.literal(repositoryId = repositoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRepositoryId]
    }
    
    @scala.inline
    implicit class IRepositoryIdMutableBuilder[Self <: IRepositoryId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepositoryData(value: IRepositoryData): Self = StObject.set(x, "repositoryData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryDataNull: Self = StObject.set(x, "repositoryData", null)
      
      @scala.inline
      def setRepositoryDataUndefined: Self = StObject.set(x, "repositoryData", js.undefined)
      
      @scala.inline
      def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    }
  }
}
