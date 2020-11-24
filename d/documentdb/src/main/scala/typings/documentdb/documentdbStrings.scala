package typings.documentdb

import typings.documentdb.mod.ConsistencyLevel
import typings.documentdb.mod.IndexKind
import typings.documentdb.mod.IndexingMode
import typings.documentdb.mod.MediaReadMode
import typings.documentdb.mod.PermissionMode
import typings.documentdb.mod.TriggerOperation
import typings.documentdb.mod.TriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentdbStrings {
  
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  
  @scala.inline
  def BoundedStaleness: BoundedStaleness = "BoundedStaleness".asInstanceOf[BoundedStaleness]
  
  @scala.inline
  def Buffered: Buffered = "Buffered".asInstanceOf[Buffered]
  
  @scala.inline
  def Consistent: Consistent = "Consistent".asInstanceOf[Consistent]
  
  @scala.inline
  def Create: Create = "Create".asInstanceOf[Create]
  
  @scala.inline
  def Delete: Delete = "Delete".asInstanceOf[Delete]
  
  @scala.inline
  def Eventual: Eventual = "Eventual".asInstanceOf[Eventual]
  
  @scala.inline
  def Hash: Hash = "Hash".asInstanceOf[Hash]
  
  @scala.inline
  def Javascript: Javascript = "Javascript".asInstanceOf[Javascript]
  
  @scala.inline
  def Lazy: Lazy = "Lazy".asInstanceOf[Lazy]
  
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @scala.inline
  def Post: Post = "Post".asInstanceOf[Post]
  
  @scala.inline
  def Pre: Pre = "Pre".asInstanceOf[Pre]
  
  @scala.inline
  def Range: Range = "Range".asInstanceOf[Range]
  
  @scala.inline
  def Read: Read = "Read".asInstanceOf[Read]
  
  @scala.inline
  def Replace: Replace = "Replace".asInstanceOf[Replace]
  
  @scala.inline
  def Session: Session = "Session".asInstanceOf[Session]
  
  @scala.inline
  def Spatial: Spatial = "Spatial".asInstanceOf[Spatial]
  
  @scala.inline
  def Streamed: Streamed = "Streamed".asInstanceOf[Streamed]
  
  @scala.inline
  def Strong: Strong = "Strong".asInstanceOf[Strong]
  
  @scala.inline
  def Update: Update = "Update".asInstanceOf[Update]
  
  @scala.inline
  def all_ : all_ = "all".asInstanceOf[all_]
  
  @scala.inline
  def create_ : create_ = "create".asInstanceOf[create_]
  
  @scala.inline
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  
  @scala.inline
  def pre_ : pre_ = "pre".asInstanceOf[pre_]
  
  @scala.inline
  def replace_ : replace_ = "replace".asInstanceOf[replace_]
  
  @scala.inline
  def update_ : update_ = "update".asInstanceOf[update_]
  
  @js.native
  sealed trait All
    extends PermissionMode
       with TriggerOperation
  
  @js.native
  sealed trait BoundedStaleness extends ConsistencyLevel
  
  @js.native
  sealed trait Buffered extends MediaReadMode
  
  @js.native
  sealed trait Consistent extends IndexingMode
  
  @js.native
  sealed trait Create extends TriggerOperation
  
  @js.native
  sealed trait Delete extends TriggerOperation
  
  @js.native
  sealed trait Eventual extends ConsistencyLevel
  
  @js.native
  sealed trait Hash extends IndexKind
  
  @js.native
  sealed trait Javascript extends js.Object
  
  @js.native
  sealed trait Lazy extends IndexingMode
  
  @js.native
  sealed trait None extends PermissionMode
  
  @js.native
  sealed trait Post extends TriggerType
  
  @js.native
  sealed trait Pre extends TriggerType
  
  @js.native
  sealed trait Range extends IndexKind
  
  @js.native
  sealed trait Read extends PermissionMode
  
  @js.native
  sealed trait Replace extends TriggerOperation
  
  @js.native
  sealed trait Session extends ConsistencyLevel
  
  @js.native
  sealed trait Spatial extends IndexKind
  
  @js.native
  sealed trait Streamed extends MediaReadMode
  
  @js.native
  sealed trait Strong extends ConsistencyLevel
  
  @js.native
  sealed trait Update extends TriggerOperation
  
  @js.native
  sealed trait all_ extends TriggerOperation
  
  @js.native
  sealed trait create_ extends TriggerOperation
  
  @js.native
  sealed trait delete_ extends TriggerOperation
  
  @js.native
  sealed trait post_ extends TriggerType
  
  @js.native
  sealed trait pre_ extends TriggerType
  
  @js.native
  sealed trait replace_ extends TriggerOperation
  
  @js.native
  sealed trait update_ extends TriggerOperation
}
