package typings.dockerfileAst.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Keyword extends js.Object

@JSImport("dockerfile-ast", "Keyword")
@js.native
object Keyword extends js.Object {
  @js.native
  sealed trait ADD extends Keyword
  
  @js.native
  sealed trait ARG extends Keyword
  
  @js.native
  sealed trait CMD extends Keyword
  
  @js.native
  sealed trait COPY extends Keyword
  
  @js.native
  sealed trait ENTRYPOINT extends Keyword
  
  @js.native
  sealed trait ENV extends Keyword
  
  @js.native
  sealed trait EXPOSE extends Keyword
  
  @js.native
  sealed trait FROM extends Keyword
  
  @js.native
  sealed trait HEALTHCHECK extends Keyword
  
  @js.native
  sealed trait LABEL extends Keyword
  
  @js.native
  sealed trait MAINTAINER extends Keyword
  
  @js.native
  sealed trait ONBUILD extends Keyword
  
  @js.native
  sealed trait RUN extends Keyword
  
  @js.native
  sealed trait SHELL extends Keyword
  
  @js.native
  sealed trait STOPSIGNAL extends Keyword
  
  @js.native
  sealed trait USER extends Keyword
  
  @js.native
  sealed trait VOLUME extends Keyword
  
  @js.native
  sealed trait WORKDIR extends Keyword
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Keyword with String] = js.native
  /* "ADD" */ @js.native
  object ADD extends TopLevel[ADD with String]
  
  /* "ARG" */ @js.native
  object ARG extends TopLevel[ARG with String]
  
  /* "CMD" */ @js.native
  object CMD extends TopLevel[CMD with String]
  
  /* "COPY" */ @js.native
  object COPY extends TopLevel[COPY with String]
  
  /* "ENTRYPOINT" */ @js.native
  object ENTRYPOINT extends TopLevel[ENTRYPOINT with String]
  
  /* "ENV" */ @js.native
  object ENV extends TopLevel[ENV with String]
  
  /* "EXPOSE" */ @js.native
  object EXPOSE extends TopLevel[EXPOSE with String]
  
  /* "FROM" */ @js.native
  object FROM extends TopLevel[FROM with String]
  
  /* "HEALTHCHECK" */ @js.native
  object HEALTHCHECK extends TopLevel[HEALTHCHECK with String]
  
  /* "LABEL" */ @js.native
  object LABEL extends TopLevel[LABEL with String]
  
  /* "MAINTAINER" */ @js.native
  object MAINTAINER extends TopLevel[MAINTAINER with String]
  
  /* "ONBUILD" */ @js.native
  object ONBUILD extends TopLevel[ONBUILD with String]
  
  /* "RUN" */ @js.native
  object RUN extends TopLevel[RUN with String]
  
  /* "SHELL" */ @js.native
  object SHELL extends TopLevel[SHELL with String]
  
  /* "STOPSIGNAL" */ @js.native
  object STOPSIGNAL extends TopLevel[STOPSIGNAL with String]
  
  /* "USER" */ @js.native
  object USER extends TopLevel[USER with String]
  
  /* "VOLUME" */ @js.native
  object VOLUME extends TopLevel[VOLUME with String]
  
  /* "WORKDIR" */ @js.native
  object WORKDIR extends TopLevel[WORKDIR with String]
  
}

