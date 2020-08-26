package typings.forkTsCheckerWebpackPlugin.anon

import typings.forkTsCheckerWebpackPlugin.filesChangeMod.FilesChange
import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.std.Error
import typings.tapable.mod.AsyncSeriesWaterfallHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canceled extends js.Object {
  var canceled: SyncHook[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
    _, 
    _
  ] = js.native
  var error: SyncHook[
    Error, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
    _
  ] = js.native
  var issues: SyncWaterfallHook[
    js.Array[Issue], 
    js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _
    ], 
    Unit
  ] = js.native
  var start: AsyncSeriesWaterfallHook[
    FilesChange, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
    _
  ] = js.native
  var waiting: SyncHook[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
    _, 
    _
  ] = js.native
}

object Canceled {
  @scala.inline
  def apply(
    canceled: SyncHook[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
      _, 
      _
    ],
    error: SyncHook[
      Error, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
      _
    ],
    issues: SyncWaterfallHook[
      js.Array[Issue], 
      js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _
      ], 
      Unit
    ],
    start: AsyncSeriesWaterfallHook[
      FilesChange, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
      _
    ],
    waiting: SyncHook[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
      _, 
      _
    ]
  ): Canceled = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canceled]
  }
  @scala.inline
  implicit class CanceledOps[Self <: Canceled] (val x: Self) extends AnyVal {
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
    def setCanceled(
      value: SyncHook[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
          _, 
          _
        ]
    ): Self = this.set("canceled", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(
      value: SyncHook[
          Error, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
          _
        ]
    ): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssues(
      value: SyncWaterfallHook[
          js.Array[Issue], 
          js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _
          ], 
          Unit
        ]
    ): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(
      value: AsyncSeriesWaterfallHook[
          FilesChange, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
          _
        ]
    ): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaiting(
      value: SyncHook[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ _, 
          _, 
          _
        ]
    ): Self = this.set("waiting", value.asInstanceOf[js.Any])
  }
  
}

