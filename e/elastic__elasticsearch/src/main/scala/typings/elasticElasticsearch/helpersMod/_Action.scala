package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _Action extends js.Object
object _Action {
  
  @scala.inline
  def IndexAction(index: Dictkey): _Action = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action]
  }
  
  @scala.inline
  def CreateAction(create: Dictkey): _Action = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action]
  }
  
  @scala.inline
  def DeleteAction(delete: Dictkey): _Action = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action]
  }
}
