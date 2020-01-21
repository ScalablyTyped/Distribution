package typings.elasticsearch

import typings.elasticsearch.mod.CatBytes
import typings.elasticsearch.mod.Conflicts
import typings.elasticsearch.mod.DefaultOperator
import typings.elasticsearch.mod.ExpandWildcards
import typings.elasticsearch.mod.VersionType
import typings.elasticsearch.mod._Refresh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object elasticsearchStrings {
  @js.native
  sealed trait AND extends DefaultOperator
  
  @js.native
  sealed trait OR extends DefaultOperator
  
  @js.native
  sealed trait _empty extends _Refresh
  
  @js.native
  sealed trait abort extends Conflicts
  
  @js.native
  sealed trait all extends ExpandWildcards
  
  @js.native
  sealed trait always extends js.Object
  
  @js.native
  sealed trait b extends CatBytes
  
  @js.native
  sealed trait blocked extends js.Object
  
  @js.native
  sealed trait closed extends ExpandWildcards
  
  @js.native
  sealed trait cluster extends js.Object
  
  @js.native
  sealed trait cpu extends js.Object
  
  @js.native
  sealed trait create extends js.Object
  
  @js.native
  sealed trait dfs_query_and_fetch extends js.Object
  
  @js.native
  sealed trait dfs_query_then_fetch extends js.Object
  
  @js.native
  sealed trait external extends VersionType
  
  @js.native
  sealed trait external_gte extends VersionType
  
  @js.native
  sealed trait force extends VersionType
  
  @js.native
  sealed trait g extends CatBytes
  
  @js.native
  sealed trait gb extends CatBytes
  
  @js.native
  sealed trait green extends js.Object
  
  @js.native
  sealed trait high extends js.Object
  
  @js.native
  sealed trait immediate extends js.Object
  
  @js.native
  sealed trait index extends js.Object
  
  @js.native
  sealed trait indices extends js.Object
  
  @js.native
  sealed trait internal extends VersionType
  
  @js.native
  sealed trait k extends CatBytes
  
  @js.native
  sealed trait kb extends CatBytes
  
  @js.native
  sealed trait languid extends js.Object
  
  @js.native
  sealed trait low extends js.Object
  
  @js.native
  sealed trait m extends CatBytes
  
  @js.native
  sealed trait mb extends CatBytes
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait node extends js.Object
  
  @js.native
  sealed trait nodes extends js.Object
  
  @js.native
  sealed trait none extends ExpandWildcards
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait open extends ExpandWildcards
  
  @js.native
  sealed trait p extends CatBytes
  
  @js.native
  sealed trait parents extends js.Object
  
  @js.native
  sealed trait pb extends CatBytes
  
  @js.native
  sealed trait popular extends js.Object
  
  @js.native
  sealed trait proceed extends Conflicts
  
  @js.native
  sealed trait query_and_fetch extends js.Object
  
  @js.native
  sealed trait query_then_fetch extends js.Object
  
  @js.native
  sealed trait red extends js.Object
  
  @js.native
  sealed trait shards extends js.Object
  
  @js.native
  sealed trait t extends CatBytes
  
  @js.native
  sealed trait tb extends CatBytes
  
  @js.native
  sealed trait urgent extends js.Object
  
  @js.native
  sealed trait wait extends js.Object
  
  @js.native
  sealed trait wait_for extends _Refresh
  
  @js.native
  sealed trait yellow extends js.Object
  
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def OR: OR = "OR".asInstanceOf[OR]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def b: b = "b".asInstanceOf[b]
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def cluster: cluster = "cluster".asInstanceOf[cluster]
  @scala.inline
  def cpu: cpu = "cpu".asInstanceOf[cpu]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def dfs_query_and_fetch: dfs_query_and_fetch = "dfs_query_and_fetch".asInstanceOf[dfs_query_and_fetch]
  @scala.inline
  def dfs_query_then_fetch: dfs_query_then_fetch = "dfs_query_then_fetch".asInstanceOf[dfs_query_then_fetch]
  @scala.inline
  def external: external = "external".asInstanceOf[external]
  @scala.inline
  def external_gte: external_gte = "external_gte".asInstanceOf[external_gte]
  @scala.inline
  def force: force = "force".asInstanceOf[force]
  @scala.inline
  def g: g = "g".asInstanceOf[g]
  @scala.inline
  def gb: gb = "gb".asInstanceOf[gb]
  @scala.inline
  def green: green = "green".asInstanceOf[green]
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  @scala.inline
  def immediate: immediate = "immediate".asInstanceOf[immediate]
  @scala.inline
  def index: index = "index".asInstanceOf[index]
  @scala.inline
  def indices: indices = "indices".asInstanceOf[indices]
  @scala.inline
  def internal: internal = "internal".asInstanceOf[internal]
  @scala.inline
  def k: k = "k".asInstanceOf[k]
  @scala.inline
  def kb: kb = "kb".asInstanceOf[kb]
  @scala.inline
  def languid: languid = "languid".asInstanceOf[languid]
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  @scala.inline
  def m: m = "m".asInstanceOf[m]
  @scala.inline
  def mb: mb = "mb".asInstanceOf[mb]
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def nodes: nodes = "nodes".asInstanceOf[nodes]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def p: p = "p".asInstanceOf[p]
  @scala.inline
  def parents: parents = "parents".asInstanceOf[parents]
  @scala.inline
  def pb: pb = "pb".asInstanceOf[pb]
  @scala.inline
  def popular: popular = "popular".asInstanceOf[popular]
  @scala.inline
  def proceed: proceed = "proceed".asInstanceOf[proceed]
  @scala.inline
  def query_and_fetch: query_and_fetch = "query_and_fetch".asInstanceOf[query_and_fetch]
  @scala.inline
  def query_then_fetch: query_then_fetch = "query_then_fetch".asInstanceOf[query_then_fetch]
  @scala.inline
  def red: red = "red".asInstanceOf[red]
  @scala.inline
  def shards: shards = "shards".asInstanceOf[shards]
  @scala.inline
  def t: t = "t".asInstanceOf[t]
  @scala.inline
  def tb: tb = "tb".asInstanceOf[tb]
  @scala.inline
  def urgent: urgent = "urgent".asInstanceOf[urgent]
  @scala.inline
  def wait_for: wait_for = "wait_for".asInstanceOf[wait_for]
  @scala.inline
  def yellow: yellow = "yellow".asInstanceOf[yellow]
}

