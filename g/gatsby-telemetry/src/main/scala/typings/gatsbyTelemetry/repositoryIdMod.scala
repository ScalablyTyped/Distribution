package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryIdMod {
  
  @JSImport("gatsby-telemetry/lib/repository-id", "getRepoMetadata")
  @js.native
  def getRepoMetadata(url: String): IRepositoryData | Null = js.native
  
  @JSImport("gatsby-telemetry/lib/repository-id", "getRepositoryId")
  @js.native
  def getRepositoryId(): IRepositoryId = js.native
  
  @js.native
  trait IRepositoryData extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var owner: js.UndefOr[String] = js.native
    
    var provider: String = js.native
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
  
  @js.native
  trait IRepositoryId extends StObject {
    
    var repositoryData: js.UndefOr[IRepositoryData | Null] = js.native
    
    var repositoryId: String = js.native
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
