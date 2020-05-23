package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activeanon extends js.Object {
  var active_anon: Double
  var active_file: Double
  var cache: Double
  var hierarchical_memory_limit: Double
  var inactive_anon: Double
  var inactive_file: Double
  var mapped_file: Double
  var pgfault: Double
  var pgmajfault: Double
  var pgpgin: Double
  var pgpgout: Double
  var rss: Double
  var rss_huge: Double
  var total_active_anon: Double
  var total_active_file: Double
  var total_cache: Double
  var total_inactive_anon: Double
  var total_inactive_file: Double
  var total_mapped_file: Double
  var total_pgfault: Double
  var total_pgmajfault: Double
  var total_pgpgin: Double
  var total_pgpgout: Double
  var total_rss: Double
  var total_rss_huge: Double
  var total_unevictable: Double
  var total_writeback: Double
  var unevictable: Double
  var writeback: Double
}

object Activeanon {
  @scala.inline
  def apply(
    active_anon: Double,
    active_file: Double,
    cache: Double,
    hierarchical_memory_limit: Double,
    inactive_anon: Double,
    inactive_file: Double,
    mapped_file: Double,
    pgfault: Double,
    pgmajfault: Double,
    pgpgin: Double,
    pgpgout: Double,
    rss: Double,
    rss_huge: Double,
    total_active_anon: Double,
    total_active_file: Double,
    total_cache: Double,
    total_inactive_anon: Double,
    total_inactive_file: Double,
    total_mapped_file: Double,
    total_pgfault: Double,
    total_pgmajfault: Double,
    total_pgpgin: Double,
    total_pgpgout: Double,
    total_rss: Double,
    total_rss_huge: Double,
    total_unevictable: Double,
    total_writeback: Double,
    unevictable: Double,
    writeback: Double
  ): Activeanon = {
    val __obj = js.Dynamic.literal(active_anon = active_anon.asInstanceOf[js.Any], active_file = active_file.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], hierarchical_memory_limit = hierarchical_memory_limit.asInstanceOf[js.Any], inactive_anon = inactive_anon.asInstanceOf[js.Any], inactive_file = inactive_file.asInstanceOf[js.Any], mapped_file = mapped_file.asInstanceOf[js.Any], pgfault = pgfault.asInstanceOf[js.Any], pgmajfault = pgmajfault.asInstanceOf[js.Any], pgpgin = pgpgin.asInstanceOf[js.Any], pgpgout = pgpgout.asInstanceOf[js.Any], rss = rss.asInstanceOf[js.Any], rss_huge = rss_huge.asInstanceOf[js.Any], total_active_anon = total_active_anon.asInstanceOf[js.Any], total_active_file = total_active_file.asInstanceOf[js.Any], total_cache = total_cache.asInstanceOf[js.Any], total_inactive_anon = total_inactive_anon.asInstanceOf[js.Any], total_inactive_file = total_inactive_file.asInstanceOf[js.Any], total_mapped_file = total_mapped_file.asInstanceOf[js.Any], total_pgfault = total_pgfault.asInstanceOf[js.Any], total_pgmajfault = total_pgmajfault.asInstanceOf[js.Any], total_pgpgin = total_pgpgin.asInstanceOf[js.Any], total_pgpgout = total_pgpgout.asInstanceOf[js.Any], total_rss = total_rss.asInstanceOf[js.Any], total_rss_huge = total_rss_huge.asInstanceOf[js.Any], total_unevictable = total_unevictable.asInstanceOf[js.Any], total_writeback = total_writeback.asInstanceOf[js.Any], unevictable = unevictable.asInstanceOf[js.Any], writeback = writeback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activeanon]
  }
}

