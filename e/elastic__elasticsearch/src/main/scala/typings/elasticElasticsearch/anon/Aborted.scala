package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.connectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aborted[TContext] extends js.Object {
  var aborted: Boolean = js.native
  var attempts: Double = js.native
  var connection: default = js.native
  var context: TContext = js.native
  var name: String = js.native
  var request: Options = js.native
  var sniff: js.UndefOr[Hosts] = js.native
}

object Aborted {
  @scala.inline
  def apply[TContext](
    aborted: Boolean,
    attempts: Double,
    connection: default,
    context: TContext,
    name: String,
    request: Options
  ): Aborted[TContext] = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], attempts = attempts.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aborted[TContext]]
  }
  @scala.inline
  implicit class AbortedOps[Self <: Aborted[_], TContext] (val x: Self with Aborted[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttempts(value: Double): Self = this.set("attempts", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection(value: default): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Options): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSniff(value: Hosts): Self = this.set("sniff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSniff: Self = this.set("sniff", js.undefined)
  }
  
}

