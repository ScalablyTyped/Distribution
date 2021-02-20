package typings.gitDiffParser

import typings.gitDiffParser.gitDiffParserBooleans.`false`
import typings.gitDiffParser.gitDiffParserBooleans.`true`
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-diff-parser", JSImport.Namespace)
  @js.native
  def apply(input: String): Result = js.native
  @JSImport("git-diff-parser", JSImport.Namespace)
  @js.native
  def apply(input: Buffer): Result = js.native
  
  @js.native
  trait Commit extends StObject {
    
    var files: js.Array[File] = js.native
  }
  object Commit {
    
    @scala.inline
    def apply(files: js.Array[File]): Commit = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commit]
    }
    
    @scala.inline
    implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DetailedCommit extends Commit {
    
    var author: js.UndefOr[String] = js.native
    
    var date: js.UndefOr[Date] = js.native
    
    var email: js.UndefOr[String] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var sha: js.UndefOr[String] = js.native
  }
  object DetailedCommit {
    
    @scala.inline
    def apply(files: js.Array[File]): DetailedCommit = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedCommit]
    }
    
    @scala.inline
    implicit class DetailedCommitMutableBuilder[Self <: DetailedCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setSha(value: String): Self = StObject.set(x, "sha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShaUndefined: Self = StObject.set(x, "sha", js.undefined)
    }
  }
  
  @js.native
  trait DetailedResult extends Result {
    
    @JSName("commits")
    var commits_DetailedResult: js.Array[DetailedCommit] = js.native
    
    @JSName("detailed")
    var detailed_DetailedResult: `true` = js.native
  }
  object DetailedResult {
    
    @scala.inline
    def apply(commits: js.Array[DetailedCommit], detailed: `true`): DetailedResult = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedResult]
    }
    
    @scala.inline
    implicit class DetailedResultMutableBuilder[Self <: DetailedResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommits(value: js.Array[DetailedCommit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitsVarargs(value: DetailedCommit*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      @scala.inline
      def setDetailed(value: `true`): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DryResult extends Result {
    
    @JSName("detailed")
    var detailed_DryResult: `false` = js.native
  }
  object DryResult {
    
    @scala.inline
    def apply(commits: js.Array[Commit], detailed: `false`): DryResult = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryResult]
    }
    
    @scala.inline
    implicit class DryResultMutableBuilder[Self <: DryResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetailed(value: `false`): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait File extends StObject {
    
    var added: Boolean = js.native
    
    var binary: Boolean = js.native
    
    var deleted: Boolean = js.native
    
    var index: js.UndefOr[js.Array[String]] = js.native
    
    var lines: js.Array[Line] = js.native
    
    var name: String = js.native
    
    var oldName: js.UndefOr[String] = js.native
    
    var renamed: Boolean = js.native
  }
  object File {
    
    @scala.inline
    def apply(
      added: Boolean,
      binary: Boolean,
      deleted: Boolean,
      lines: js.Array[Line],
      name: String,
      renamed: Boolean
    ): File = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renamed = renamed.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: Boolean): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setLines(value: js.Array[Line]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesVarargs(value: Line*): Self = StObject.set(x, "lines", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldName(value: String): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldNameUndefined: Self = StObject.set(x, "oldName", js.undefined)
      
      @scala.inline
      def setRenamed(value: Boolean): Self = StObject.set(x, "renamed", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Line extends StObject {
    
    /** Has line break. Always false for added failes */
    var break: Boolean = js.native
    
    /** The main line number */
    var ln1: Double = js.native
    
    /** New line number (for type normal) */
    var ln2: js.UndefOr[Double] = js.native
    
    /** Content of removed or added string */
    var text: String = js.native
    
    var `type`: LineType = js.native
  }
  object Line {
    
    @scala.inline
    def apply(break: Boolean, ln1: Double, text: String, `type`: LineType): Line = {
      val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], ln1 = ln1.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Line]
    }
    
    @scala.inline
    implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreak(value: Boolean): Self = StObject.set(x, "break", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLn1(value: Double): Self = StObject.set(x, "ln1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLn2(value: Double): Self = StObject.set(x, "ln2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLn2Undefined: Self = StObject.set(x, "ln2", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: LineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents prefix in `git diff` output: '+', '-', or space */
  /* Rewritten from type alias, can be one of: 
    - typings.gitDiffParser.gitDiffParserStrings.deleted
    - typings.gitDiffParser.gitDiffParserStrings.added
    - typings.gitDiffParser.gitDiffParserStrings.normal
  */
  trait LineType extends StObject
  object LineType {
    
    @scala.inline
    def added: typings.gitDiffParser.gitDiffParserStrings.added = "added".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.added]
    
    @scala.inline
    def deleted: typings.gitDiffParser.gitDiffParserStrings.deleted = "deleted".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.deleted]
    
    @scala.inline
    def normal: typings.gitDiffParser.gitDiffParserStrings.normal = "normal".asInstanceOf[typings.gitDiffParser.gitDiffParserStrings.normal]
  }
  
  @js.native
  trait Result extends StObject {
    
    var commits: js.Array[Commit] = js.native
    
    var detailed: Boolean = js.native
  }
  object Result {
    
    @scala.inline
    def apply(commits: js.Array[Commit], detailed: Boolean): Result = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], detailed = detailed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommits(value: js.Array[Commit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      @scala.inline
      def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
    }
  }
}
